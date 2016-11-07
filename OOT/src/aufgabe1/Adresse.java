package aufgabe1;
//----
public class Adresse {
	String straﬂenName;
	int straﬂenNr;
	int plz;
	String stadt;

	public Adresse(String straﬂenName, int straﬂenNr, int plz, String stadt) {
		this.straﬂenName = straﬂenName;
		this.straﬂenNr = straﬂenNr;
		this.plz = plz;
		this.stadt = stadt;

	}

	public String getStraﬂenName() {
		return straﬂenName;
	}

	public int getStraﬂenNr() {
		return straﬂenNr;
	}

	public int getPlz() {
		return plz;
	}

	public String getStadt() {
		return stadt;
	}
}
