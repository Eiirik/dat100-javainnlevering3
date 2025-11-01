package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        try {
            String filLokasjon = mappe + filnavn;
            PrintWriter skriver = new PrintWriter(filLokasjon);

            skriver.println(samling.toString());
            skriver.close();
            return true;
        }
        catch (FileNotFoundException e) {
            System.out.println("Filen ble ikke funnet.");
            e.printStackTrace();
            return false;
        }
    }
}
