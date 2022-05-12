
/**
 * 
 * @author Rene.KOESSLER
 *
 */
public class PKW extends Fahrzeug {
	/**
	 * @return Attribute
	 */
	private String marke;
	private String modell;
	private int baujahr;
	public PKW()
	{}
	
	/**
	 * @param anzahlReifen
	 * @param anzahlSitzplaetze
	 * @param zulassung
	 * @param farbe
	 * @param leistung
	 * @param kraftstoffVerbrauch
	 * @param kraftstoffArt
	 * @param getriebeart
	 * @param anzahlGänge
	 * @param maxDrehZahl
	 * @param marke
	 * @param modell
	 * @param baujahr
	 */
	public PKW(int anzahlReifen, int anzahlSitzplaetze, boolean zulassung, String farbe, int leistung,
			int kraftstoffVerbrauch, String kraftstoffArt, String getriebeart, int anzahlGänge, int maxDrehZahl,
			String marke, String modell, int baujahr) {
		super(anzahlReifen, anzahlSitzplaetze, zulassung, farbe, leistung, kraftstoffVerbrauch, kraftstoffArt, getriebeart,
				anzahlGänge, maxDrehZahl);
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
		
	}



	/**
	 * @return the marke
	 */
	public String getMarke() {
		return marke;
	}
	/**
	 * @param marke the marke to set
	 */
	public void setMarke(String marke) {
		this.marke = marke;
	}
	/**
	 * @return the modell
	 */
	public String getModell() {
		return modell;
	}
	/**
	 * @param modell the modell to set
	 */
	public void setModell(String modell) {
		this.modell = modell;
	}
	/**
	 * @return the baujahr
	 */
	public int getBaujahr() {
		return baujahr;
	}
	/**
	 * @param baujahr the baujahr to set
	 */
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	

	
	public void heizen() {
		
	}
	
	public void radio() {
		
	}


}
