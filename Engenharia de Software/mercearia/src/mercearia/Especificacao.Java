package mercearia;

public class Especificacao {

    // Atributos Comida
    private String tipoComida;
    private String marcaComida;
    private int quantidadeComida;

    // Atributos Bebida
    private String tipoBebida;
    private String marcaBebida;
    private int quantidadeBebida;


    public EspecificacaoComida(String tipoComida, String marcaComida, int quantidadeComida){
        this.tipoComida = tipoComida;
        this.marcaComida = marcaComida;
        this.quantidadeComida = quantidadeComida;   
    }
    public EspecificacaoBebida(String tipoBebida, String marcaBebida, int quantidadeBebida){
        this.tipoBebida = tipoBebida;
        this.marcaBebida = marcaBebida;
        this.quantidadeBebida = quantidadeBebida;
    }


    // Metodos de Acesso Get Bebida
    public String getTipoBebida() {
        return tipoBebida;
    }
    public String getMarcaBebida() {
        return marcaBebida;
    }
    public int getQuantidadeBebida() {
        return quantidadeBebida;
    }

    // Metodos de Acesso Set Bebida
    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }
    public void setMarcaBebida(String marcaBebida) {
        this.marcaBebida = marcaBebida;
    }
    public void setQuantidadeBebida(int quantidadeBebida) {
        this.quantidadeBebida = quantidadeBebida;
    }

    // Metodos de Acesso Get Comida
    public String getTipoComiida() {
        return tipoComida;
    }
    public String getMarcaComida() {
        return marcaComida;
    }
    public int getQuantidadeComida() {
        return quantidadeComida;
    }

     // Metodos de acesso Set Comida
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
