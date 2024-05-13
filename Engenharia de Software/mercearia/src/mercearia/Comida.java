package mercearia;

public class Comida {
    
    // Atributos
    private String nomeComida;
    private String tipoComida;
    private String marcaComida;
    private int qntdComida;

    public Comida(String nomeComida, String tipoComida, String marcaComida, int qntdComida){
        this.nomeComida = nomeComida;
        this.tipoComida = tipoComida;
        this.marcaComida = marcaComida;
        this.qntdComida = qntdComida;
    }
       
    // Metodo Acesso nomeComida
	public String getnomeComida() {return nomeComida;}
	public void setnomeComida(String nomeComida) {this.nomeComida = nomeComida;}

    // Metodo Acesso tipoComida Comida
    public String gettipoComida() {return this.tipoComida;}
    public void settipoComida(String tipoComida) {this.tipoComida = tipoComida;}

    // Metodo Acesso marcaComida Comida
    public String getmarcaComida() {return marcaComida;}
    public void setmarcaComida(String marcaComida) {this.marcaComida = marcaComida;}

    // Metodo Acesso Quantidade Comida
    public int getQuantidade() {return qntdComida;}
    public void setQuantidade(int qntdComida) {this.qntdComida = qntdComida;}

}
