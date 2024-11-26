public class TransporteFactory {
    public static Transporte obterTransporte(Pedido pedido) {
        if (pedido.isInternacional()) {
            return new TransporteMaritimo();  // Transporte marítimo para entregas internacionais
        } else if (pedido.isMetropolitana()) {
            if (pedido.getPeso() <= 5) {
                return new TransporteDrone();  // Drone para áreas metropolitanas e pacotes pequenos
            } else {
                return new TransporteTerrestre();  // Transporte terrestre para pacotes maiores
            }
        } else {
            if (pedido.getPeso() <= 50) {
                return new TransporteAereo();  // Transporte aéreo para pacotes de até 50kg
            } else {
                return new TransporteTerrestre();  // Caso o peso seja maior, usa transporte terrestre
            }
        }
    }
}
