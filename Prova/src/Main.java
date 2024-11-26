public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();
        pedido1.setPeso(10);
        pedido1.setMetropolitana(true);
        pedido1.setTransportadora("Transportadora A");


        Transporte transporte = TransporteFactory.obterTransporte(pedido1);
        transporte.executarEntrega(pedido1);


        Pedido pedido2 = new Pedido();
        pedido2.setPeso(20);
        pedido2.setInternacional(true);

        Transporte transporte2 = TransporteFactory.obterTransporte(pedido2);
        transporte2.executarEntrega(pedido2);
    }
}
