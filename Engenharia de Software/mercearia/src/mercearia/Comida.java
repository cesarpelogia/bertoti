package mercearia;

public class Comida {
    // Atributos
    private String tipoComida;
    private String marcaComida;
    private int quantidadeComida;

    // Metodos de acesso Get
    public String getTipoComida() {
        return tipoComida;
    }

    public String getMarcaComida() {
        return marcaComida;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    // Metodos de acesso Set
    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public void setMarcaComida(String marcaComida) {
        this.marcaComida = marcaComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }
}
