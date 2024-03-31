package mercearia;

public class Bebida {
    // Atributos
    private String tipoBebida;
    private String marcaBebida;
    private int quantidadeBebida;

    // Metodos de Acesso Get
    public String getTipoBebida() {
        return tipoBebida;
    }

    public String getMarcaBebida() {
        return marcaBebida;
    }

    public int getQuantidadeBebida() {
        return quantidadeBebida;
    }

    // Metodos de Acesso Set
    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public void setMarcaBebida(String marcaBebida) {
        this.marcaBebida = marcaBebida;
    }

    public void setQuantidadeBebida(int quantidadeBebida) {
        this.quantidadeBebida = quantidadeBebida;
    }
}
