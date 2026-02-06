class Peixe {
    String nome;
    double tamanho;

    Peixe(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }
}

class Polvo {
    String nome;
    int tentaculos;

    Polvo(String nome, int tentaculos) {
        this.nome = nome;
        this.tentaculos = tentaculos;
    }
}

class Cesto<T> {
    private T conteudo;

    public void guardar(T coisa) {
        this.conteudo = coisa;
    }

    public T pegar() {
        return conteudo;
    }

    public static void main(String[] args) {
        Cesto<Peixe> cestoDePeixes = new Cesto<>();
        cestoDePeixes.guardar(new Peixe("Nemo", 0.5));
        Cesto<Polvo> cestoDePolvos = new Cesto<>();
        cestoDePolvos.guardar(new Polvo("Polvinho", 8));
        Peixe peixe = cestoDePeixes.pegar();
        Polvo polvo = cestoDePolvos.pegar();
        System.out.println("Peixe: " + peixe.nome + " Tamanho: " + peixe.tamanho
        );
        System.out.println("Polvo: " + polvo.nome + " Tentaculos: " + polvo.tentaculos);

    }
}
