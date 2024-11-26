public class TransporteTerrestre implements Transporte {
    @Override
    public void executarEntrega(Pedido pedido) {
        System.out.println("Transportando por via terrestre. Transportadora local: " + pedido.getTransportadora());
    }
}
