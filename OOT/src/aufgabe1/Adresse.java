package aufgabe1;
//----
public class Adresse {
	String stra�enName;
	int stra�enNr;
	int plz;
	String stadt;

	public Adresse(String stra�enName, int stra�enNr, int plz, String stadt) {
		this.stra�enName = stra�enName;
		this.stra�enNr = stra�enNr;
		this.plz = plz;
		this.stadt = stadt;

	}

	public String getStra�enName() {
		return stra�enName;
	}

	public int getStra�enNr() {
		return stra�enNr;
	}

	public int getPlz() {
		return plz;
	}

	public String getStadt() {
		return stadt;
	}
}
