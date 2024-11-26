public class Pedido {
    private double peso;
    private boolean internacional;
    private boolean metropolitana;
    private String transportadora;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public boolean isMetropolitana() {
        return metropolitana;
    }

    public void setMetropolitana(boolean metropolitana) {
        this.metropolitana = metropolitana;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }
}
