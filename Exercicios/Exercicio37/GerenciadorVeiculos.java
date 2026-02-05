
abstract class Veiculo {

    String placa;
    int ano;

    void exibirInformacoes() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

class Onibus extends Veiculo {

    int assentos;

    @Override
    void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Assentos: " + assentos);
    }
}

class Caminhao extends Veiculo {

    int eixos;

    @Override
    void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Eixos: " + eixos);
    }
}

public class GerenciadorVeiculos {

    public static void main(String[] args) {
        Onibus onibus = new Onibus();
        onibus.placa = "ABC-1234";
        onibus.ano = 2015;
        onibus.assentos = 50;

        Caminhao caminhao = new Caminhao();
        caminhao.placa = "XYZ-5678";
        caminhao.ano = 2018;
        caminhao.eixos = 4;

        System.out.println("Informações do Ônibus:");
        onibus.exibirInformacoes();

        System.out.println("\nInformações do Caminhão:");
        caminhao.exibirInformacoes();
    }
}
