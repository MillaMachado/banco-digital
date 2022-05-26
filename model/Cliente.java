package model;

public class Cliente{
	
    protected String nome;
    
    public Cliente() {
	}
    
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
    
    
}
