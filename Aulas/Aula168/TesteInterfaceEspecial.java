interface ExemploInterfaceEspecial{
    //Método abstrato
    void metodoAbstrato();

    //Método default
    default void metodoDefault(){
        System.out.println("Este é um método default na interface.");
    }

    //Método estático (static)
    static void metodoStatic(){
        System.out.println("Este é um método estático na interface.");
    }
}

class TesteInterfaceEspecial implements ExemploInterfaceEspecial{
    public void metodoAbstrato(){
        System.out.println("Implementação do método abstrato.");
    }

    public static void main(String[] args) {
        TesteInterfaceEspecial exemplo = new TesteInterfaceEspecial();
        exemplo.metodoAbstrato();
        exemplo.metodoDefault();
        ExemploInterfaceEspecial.metodoStatic();

    }
}
