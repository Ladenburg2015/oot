package aufgabe1;

import java.time.LocalDate;

public class Student {

	private String name;
	private String vorname;
	private LocalDate Gebdatum;
	int matrikelnummer;
	private Adresse adresse;
	private int alter;

	public Student(String name, String vorname, LocalDate Gebdatum,
			int matrikelnummer) {
		this(name, vorname, Gebdatum, matrikelnummer, null);
		this.alter = AlterBerechnen();
	}

	public Student(String name, String vorname, LocalDate Gebdatum,
			int matrikelnummer, Adresse adresse) {
		this.name = name;
		this.vorname = vorname;
		this.Gebdatum = Gebdatum;
		this.matrikelnummer = matrikelnummer;
		this.adresse = adresse;
		this.alter = AlterBerechnen();

	}

	private int AlterBerechnen() {
		LocalDate heute = LocalDate.now();

		int diffYear = heute.getYear() - Gebdatum.getYear();
		boolean hatteGeburtstag = heute.getDayOfYear() >= Gebdatum
				.getDayOfYear();
		if (hatteGeburtstag) {
			alter = diffYear;
		} else {
			alter = diffYear - 1;

		}
		return alter;
	}

	public int getAlter() {
		return alter;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public LocalDate getGebdatum() {
		return Gebdatum;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	// @Override
	public boolean equals(Student student) {

		if (student.getName().equals(this.getName())
				&& student.getVorname().equals(this.getVorname())
				&& student.getGebdatum().equals(this.getGebdatum())
				&& student.getMatrikelnummer() == this.getMatrikelnummer()) {

			return true;

		}

		return false;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", vorname=" + vorname + ", Gebdatum="
				+ Gebdatum + ", matrikelnummer=" + matrikelnummer
				+ ", adresse=" + adresse + ", alter=" + alter + "]";
	}

	public static void main(String args[]) {
		Student x = new Student("boudjio", "erica", LocalDate.of(1990, 10, 10),
				1424532);
		Student x2 = new Student("boudjio", "erica",
				LocalDate.of(1990, 10, 10), 1424532);
		Student y = new Student("boudj", "eric", LocalDate.of(1993, 10, 20),
				142453);

		Student z = new Student("bou", "eri", LocalDate.of(1987, 03, 25),
				142532);
		Student k = new Student("bo", "er", LocalDate.of(1989, 04, 8), 124532);

		Student p = new EingeschriebeneStudent("boujio", "eica", LocalDate.of(
				1990, 10, 9), 1424532, LocalDate.of(2003, 12, 12));

		Student o = new Gaststudent("boujio", "eica",
				LocalDate.of(1990, 10, 9), 1424532, LocalDate.of(2018, 12, 12),
				7);

		Student[] studenten = { x, y, z, k, o, p };

		double durchschnitt = AltBerechnen.durchschnittAlt(studenten);

		System.out.println(durchschnitt);

		System.out.println(x.equals(x2));
		System.out.println(y.equals(x2));
		System.out.println(x.toString());

	}
}
