package aufgabe1;
//----
public class Adresse {
	String straßenName;
	int straßenNr;
	int plz;
	String stadt;

	public Adresse(String straßenName, int straßenNr, int plz, String stadt) {
		this.straßenName = straßenName;
		this.straßenNr = straßenNr;
		this.plz = plz;
		this.stadt = stadt;

	}

	public String getStraßenName() {
		return straßenName;
	}

	public int getStraßenNr() {
		return straßenNr;
	}

	public int getPlz() {
		return plz;
	}

	public String getStadt() {
		return stadt;
	}
}
