public class TransporteMaritimo implements Transporte {
    @Override
    public void executarEntrega(Pedido pedido) {
        // Regras específicas para transporte marítimo (apenas internacional)
        if (pedido.isInternacional()) {
            System.out.println("Transportando por via marítima. Destino internacional.");
        } else {
            System.out.println("Erro: Transporte marítimo disponível apenas para entregas internacionais.");
        }
    }
}
