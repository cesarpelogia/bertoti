package mercearia;

public class Bebida {
    
    // Atributos
    private String nome;
 

    public Bebida(String nome){
        this.nome = nome;
    }
       
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

    public void setQuantidadeBebida(int quantidadeBebida) {
        this.quantidadeBebida = quantidadeBebida;
    }
}
