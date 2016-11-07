package aufgabe1;

public class AltBerechnen {

	public static double durchschnittAlt(Student[] students) {
		Student x[] = new Student[students.length];
		int ergebnis = 0;

		for (int i = 0; i < students.length; i++) {
			x[i] = students[i];
			int alter = x[i].getAlter();
			ergebnis = ergebnis + alter;

		}

		double durchschnitt = ergebnis / students.length;
		return durchschnitt;

	}

}
