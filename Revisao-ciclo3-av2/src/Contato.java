
public class Contato {
	
	private String nome;
	private int codigoArea;
	private int telefone;
	private Tipo tipo;
	
	//construtor
	public Contato(String nome, int codigoArea, int telefone, Tipo tipo) {
		this.nome = nome;
		this.codigoArea = codigoArea;
		this.telefone = telefone;
		this.tipo = tipo;
	}
	
	//equals
	public boolean equals(Object obj) {
		if(obj instanceof Contato) {
			Contato contato = (Contato) obj;
			return this.getNome().equals(contato.getNome());
		}
		return false;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
