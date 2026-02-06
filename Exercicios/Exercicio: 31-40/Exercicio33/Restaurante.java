interface PedidoRestaurante{
    void adcionarItem(String item, double preco);
    double calcularTotal();
}

class Pedido implements PedidoRestaurante{
    private double total = 0;

    @Override
    public void adcionarItem(String item, double preco){
        System.out.println("Item adicionado: " + item + " - Preço: R$ " + preco);
        this.total += preco;
    }

    @Override
    public double calcularTotal(){
        return this.total;
    }
}

public class Restaurante{
    public static void main(String[] args){
        PedidoRestaurante pedido = new Pedido();
        pedido.adcionarItem("Hambuger", 15.00);
        pedido.adcionarItem("Batata Frita", 7.50);
        pedido.adcionarItem("Refrigerante", 5.00);
        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
    }
}