package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

private String url;
	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id,bruker,dato,tekst);
		setUrl(url);
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id,bruker,dato,likes,tekst);
		setUrl(url);
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
//		BILDE\n1\nOle Olsen\n23-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
		String utstreng = super.getId() + "\n" + super.getBruker() + "\n" + 
			super.getDato() + "\n" + super.getLikes() + "\n" + super.getTekst()  + "\n"  + getUrl() + "\n";
	        utstreng = "BILDE\n" + utstreng;
		return utstreng;	
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
