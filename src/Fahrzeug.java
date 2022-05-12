/**
 * 
 * @author Rene.KOESSLER
 *
 */
public class Fahrzeug{
	//* Attribute
	private int anzahlReifen;
	private int anzahlSitzplaetze;
	private boolean zulassung;
	private String farbe;
	Motor motor;
	Getriebe getriebe;
	
	/**Constructor*/
	public Fahrzeug() /** default Constructor*/
	{
		
	}
	
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
	 */
	public Fahrzeug(int anzahlReifen, int anzahlSitzplaetze, boolean zulassung, String farbe, int leistung, int kraftstoffVerbrauch, String kraftstoffArt, String getriebeart, int anzahlGänge, int maxDrehZahl) {
		
		this.setAnzahlReifen(anzahlReifen);
		this.setAnzahlSitzplaetze(anzahlSitzplaetze);
		this.setZulassung(zulassung);
		this.setFarbe(farbe);
		motor = new Motor(leistung, kraftstoffVerbrauch, kraftstoffArt);
		getriebe = new Getriebe(getriebeart, anzahlGänge, maxDrehZahl);
	}


	
	/** own Methods*/
	
	public void starten()
	{
		System.out.println("Das Fahrzeug startet");
	}
	
	public void stoppen()
	{
		System.out.println("Das Fahrzeug stoppt");
	}

	/**
	 * @return the anzahlReifen
	 */
	public int getAnzahlReifen() {
		return anzahlReifen;
	}

	/**
	 * @param anzahlReifen the anzahlReifen to set
	 */
	public void setAnzahlReifen(int anzahlReifen) {
		this.anzahlReifen = anzahlReifen;
	}

	/**
	 * @return the anzahlSitzplaetze
	 */
	public int getAnzahlSitzplaetze() {
		return anzahlSitzplaetze;
	}

	/**
	 * @param anzahlSitzplaetze the anzahlSitzplaetze to set
	 */
	public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
		this.anzahlSitzplaetze = anzahlSitzplaetze;
	}

	/**
	 * @return the zulassung
	 */
	public boolean isZulassung() {
		return zulassung;
	}

	/**
	 * @param zulassung the zulassung to set
	 */
	public void setZulassung(boolean zulassung) {
		this.zulassung = zulassung;
	}

	/**
	 * @return the farbe
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}



	
	
	
}
