package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {

    // Oppgave 1a)
	private int id;
    private String bruker;
    private String dato;
    private int likes;
	
	public Innlegg() {}

    // Oppgave 1b)
	public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
	}

    // Oppgave 1c - Get/Set metoder
	public String getBruker() {
        return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}

    public void setId(int id) {
        this.id = id;
    }

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++;
	}

    // Oppgave 1f)
	public boolean erLik(Innlegg innlegg) {

        return this.id == innlegg.id;
	}

    // Oppgave 1e)
	@Override
	public String toString() {

		return  id + "\n" +
                bruker + "\n" +
                dato + "\n" +
                likes + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
