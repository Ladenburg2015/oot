package aufgabe1;

import java.time.LocalDate;

public class EingeschriebeneStudent extends Student {
	private LocalDate einschreibDatum;

	public EingeschriebeneStudent(String name, String vorname,
			LocalDate Gebdatum, int matrikelnummer, LocalDate einschreibDatum) {
		super(name, vorname, Gebdatum, matrikelnummer);
		this.einschreibDatum = einschreibDatum;

	}

}
