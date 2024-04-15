package mercearia;

public class Comida {
    // Atributos
    private String nome;

    public Comida(String nome){
        this.nome = nome;
    }
       
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
    }
}

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }
}
