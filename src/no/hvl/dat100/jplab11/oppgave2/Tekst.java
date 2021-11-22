package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {
	
	private String tekst;

	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
	   super(id,bruker,dato);
		setTekst(tekst);
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		super(id,bruker,dato,likes);
		setTekst(tekst);
	}
	
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
//		TEKST\n1\nOle Olsen\n23-10\n0\nen tekst\n
//		String utstreng = this.getId() + "\n" + getBruker() + "\n" + 
//				getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n";
//		return utstreng;
		String utstreng = "TEKST\n" + super.toString() + getTekst() + "\n";
		return utstreng;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
