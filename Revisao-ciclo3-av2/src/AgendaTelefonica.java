import java.util.ArrayList;


public class AgendaTelefonica {
	
	private String nome;
	private ArrayList<Contato> contato;
	
	//construtor
	public void Agenda(String nome, ArrayList<Contato> contato) {
		this.nome = nome;
		this.contato = contato;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Contato> getContato() {
		return contato;
	}
	public void setContato(ArrayList<Contato> contato) {
		this.contato = contato;
	}

	
	
}
