public class TransporteDrone implements Transporte {
    @Override
    public void executarEntrega(Pedido pedido) {
        // Regras específicas para entrega por drones (áreas metropolitanas e pacotes pequenos)
        if (pedido.getPeso() > 5 || !pedido.isMetropolitana()) {
            System.out.println("Erro: O pacote não atende aos requisitos para entrega por drone.");
        } else {
            System.out.println("Transportando por drone. Pacote pequeno em área metropolitana.");
        }
    }
}
