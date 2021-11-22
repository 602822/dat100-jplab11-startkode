package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String fultFilnavn;
		fultFilnavn = mappe + filnavn;
		PrintWriter fil = null;
		try {
		fil = new PrintWriter(fultFilnavn);
		} catch (FileNotFoundException e) {
		System.out.println("FileNotFoundException");
		return false;
		}
		fil.print(samling.toString());
		fil.close();
		return true;
	}
}
