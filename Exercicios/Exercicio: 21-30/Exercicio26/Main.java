class SuperClasse{
    public void imprime(){
        System.out.println("Método da SuperClasse");
    }
}

class MinhaClasse extends SuperClasse{
    @Override
    public void imprime(){
        System.out.println("Método sobrescrito");
    }
}

public class Main{
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        obj.imprime();
    }
}