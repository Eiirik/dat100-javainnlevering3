package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    //Oppgave 3a) Stod ikke noe om private/public/protected
    private Innlegg[] innleggtabell;
    private int nesteLedig;

    // Oppgave 3b)
	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

    // Oppgave 3c)
	public int getAntall() {
		return nesteLedig;
	}

    // Oppgave 3d)
	public Innlegg[] getSamling() {
		 return innleggtabell;
	}

    // Oppgave 3e)
	public int finnInnlegg(Innlegg innlegg) {

		for (int i=0; i<nesteLedig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
	}

    // Oppgave ef)
	public boolean finnes(Innlegg innlegg) {
        for (int i=0; i<nesteLedig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return true;
            }
        }
        return false;
	}

    // Oppgave 3g)
	public boolean ledigPlass() {
        return nesteLedig < innleggtabell.length;
	}

    // Oppgave 3h)
	public boolean leggTil(Innlegg innlegg) {
        if (ledigPlass() && !finnes(innlegg)) {
            innleggtabell[nesteLedig] = innlegg;
            nesteLedig++;
            return true;
        }
        else {
            return false;
        }
	}

    // Oppgave 3i)
    @Override
	public String toString() {
        String temp = nesteLedig + "\n";

        for (Innlegg i : innleggtabell) {
            if (i != null) {
                temp += i.toString();
            }
        }
        return temp;
	}

	// valgfrie oppgaver nedenfor

    // Oppgave 3j)
	public void utvid() {
        Innlegg[] nyTab = new Innlegg[innleggtabell.length * 2];

        System.arraycopy(innleggtabell, 0, nyTab, 0, nesteLedig);
        innleggtabell = nyTab;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}

    // Oppgave 3I)
	public boolean slett(Innlegg innlegg) {
        if (finnes(innlegg) && innlegg != null) {
            int pos = finnInnlegg(innlegg);

            innleggtabell[pos] = innleggtabell[nesteLedig - 1];
            innleggtabell[nesteLedig - 1] = null;
            nesteLedig--;
            return true;
        }
        return false;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}