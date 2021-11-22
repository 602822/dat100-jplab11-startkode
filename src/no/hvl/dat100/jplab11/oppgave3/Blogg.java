package no.hvl.dat100.jplab11.oppgave3;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggstabell;
	private int nesteLedig;

	public Blogg() {
		Innlegg[] innleggsSamling;
		innleggsSamling = new Innlegg[20];
		this.innleggstabell = innleggsSamling;
        this.nesteLedig = 0;
	}

	public Blogg(int lengde) {
		Innlegg[] innleggsSamling;
		innleggsSamling = new Innlegg[lengde];
		this.innleggstabell = innleggsSamling;
        this.nesteLedig = 0;

	}

	public int getAntall() {
		return this.nesteLedig;
	}

	public Innlegg[] getSamling() {
		return this.innleggstabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int funnet = -1;
		Innlegg tempInnlegg;
		for (int i = 0; i < getAntall(); i++) {
			tempInnlegg = innleggstabell[i];
			if (innlegg.erLik(tempInnlegg)) {
				funnet = i;
				break;
			}
		}
		return funnet;

	}

	public boolean finnes(Innlegg innlegg) {
		if (finnInnlegg(innlegg) >= 0)
			return true;
		else
			return false;
	}

	public boolean ledigPlass() {
		if (innleggstabell.length > getAntall())
			return true;
		else
			return false;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass()) {
			this.innleggstabell[getAntall()] = innlegg;
	    	this.nesteLedig = getAntall() + 1;
			return true;
		} else
			return false;
	}

	public String toString() {
//		Innlegg tempInnlegg;
	    String utstreng;
	    utstreng = Integer.toString(getAntall()) + "\n";
		for (int i = 0; i < getAntall(); i++) {
//		tempInnlegg = innleggstabell[i];
		utstreng = utstreng + innleggstabell[i].toString();
	
		}
		return utstreng;
	}
	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}