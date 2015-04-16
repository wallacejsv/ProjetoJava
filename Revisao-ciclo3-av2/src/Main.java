import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Contato> listaContato = new ArrayList<Contato>();
		
		listaContato.add(new Contato("wallace", 21, 38681092, Tipo.AMIGOS));
		listaContato.add(new Contato("wallace", 21, 38681092, Tipo.AMIGOS));
		listaContato.add(new Contato("Jonathan", 21, 38681092, Tipo.AMIGOS));
		listaContato.add(new Contato("wallace", 21, 38681092, Tipo.AMIGOS));
		listaContato.add(new Contato("wallace", 21, 38681092, Tipo.AMIGOS));
		listaContato.add(new Contato("Jonathan", 21, 38681092, Tipo.AMIGOS));
		
		//adicionar contato na agenda
		Agenda agenda = new Agenda("minha agenda", listaContato);
		
		ArrayList<Contato> repetidos = new ArrayList<Contato>();
		for (Contato contato : agenda.getContato()) {
			int verifica = Collections.frequency(agenda.getContato(), contato);
			if((verifica > 1) && !(repetidos.contains(contato))) {
				repetidos.add(contato);
				System.out.println(contato.getNome() + " repete-se " + verifica);
			}
		}

	}

}
