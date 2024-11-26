public class TransporteAereo implements Transporte {
    @Override
    public void executarEntrega(Pedido pedido) {
        // Regras específicas para transporte aéreo
        if (pedido.getPeso() > 50) {
            System.out.println("Erro: O peso excede o limite para transporte aéreo.");
        } else {
            System.out.println("Transportando por via aérea. Peso: " + pedido.getPeso() + "kg.");
        }
    }
}
