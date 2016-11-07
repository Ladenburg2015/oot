package aufgabe1;

import java.time.LocalDate;

public class Gaststudent extends Student {
	private LocalDate taetigkeitEnde;
	private int semesterAnzahl;

	public Gaststudent(String name, String vorname, LocalDate Gebdatum,
			int matrikelnummer, LocalDate taetigkeitEnde, int semesterAnzahl) {
		super(name, vorname, Gebdatum, matrikelnummer);
		this.semesterAnzahl = semesterAnzahl;
		this.taetigkeitEnde = taetigkeitEnde;
	}

}
