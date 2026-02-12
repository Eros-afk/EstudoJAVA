import org.json.JSONObject;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


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
        System.out.println("Digite o nome da cidade: ");
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
}