import org.json.JSONObject;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;


/*
import java.net.URI;
import java.net.http.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
*/

public class ProjetoMeteorologico{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine(); //Lê a cidade do teclado

        try {
            String dadosClimaticos = getDadosClimaticos(cidade);
            //Codigo 1006 significa localização nao é encontrada.
            if (dadosClimaticos.contains("\"code\":1006")) { // \"code\":1006 representa "code":1006
                System.out.println("Localização não encontrada. Por favor, tente novamente.");
            } else {
                imprimirDadosClimaticos(dadosClimaticos);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getDadosClimaticos(String cidade) throws Exception {
        String apiKey = Files.readString(Paths.get("api-key.txt")).trim();

        String formataNomeCidade = URLEncoder.encode(cidade, StandardCharsets.UTF_8);
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
        //Começa a construção de uma nova solicitação HTTP
        //Este método define o URI da solicitação HTTP
        //Finaliza a construção da solicitação HTTP
        //Isso é da parte do newBuilder(), //URI, //Finaliza a HTTP

        //Criar objeto enviar solicitações HTTP e receber respostas HTTP, para acessar o site da WeatherAPI
        HttpClient client = HttpClient.newHttpClient();

        //Agora vamos enviar requisições HTTP e receber respostas HTTP, comunicar com o site da API Meteorologica.
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body(); //Retorna os dados meteorologicos obtidos no site da API (WeatherAPI)
    }

    //Método para imprimir os dados meteorológicos de forma organizadas
    public static void imprimirDadosClimaticos(String dadosClimaticos) {
        JSONObject dadosJson = new JSONObject(dadosClimaticos);
        JSONObject informacoesMeteorologicas = dadosJson.getJSONObject("current");

        //Extrai os dados da localização
        String cidade = dadosJson.getJSONObject("location").getString("name");
        String pais = dadosJson.getJSONObject("location").getString("country");

        //Extrai os dados adicionais
        String condicaoTempo = informacoesMeteorologicas.getJSONObject("condition").getString("text");
        int umidade = informacoesMeteorologicas.getInt("humidity");
        float velocidadeVento = informacoesMeteorologicas.getFloat("wind_kph");
        float pressaoAtmosferica = informacoesMeteorologicas.getFloat("pressure_mb");
        float sensacaoTermica = informacoesMeteorologicas.getFloat("feelslike_c");
        float temperaturaAtual = informacoesMeteorologicas.getFloat("temp_c");

        //Extrai a data e hora da string retornada pela API
        String dataHoraString = informacoesMeteorologicas.getString("last_updated");

        //Imprime as informações atuais
        System.out.println("Informações Meteorológicas para: " + cidade + ", " + pais);
        System.out.println("Data e Hora: " + dataHoraString);
        System.out.println("Temperatura Atual: " + temperaturaAtual + "°C");
        System.out.println("Sensação Térmica: " + sensacaoTermica + "°C");
        System.out.println("Condição do Tempo: " + condicaoTempo);
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Velocidade do Vento: " + velocidadeVento + "km/h");
        System.out.println("Pressão Atmosférica: " + pressaoAtmosferica + "mb");
        System.out.println("");
    }
}