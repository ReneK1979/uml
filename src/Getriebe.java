/**
 * 
 * @author Rene.KOESSLER
 *
 */
public class Getriebe {
	/** Attribute*/
	private String getriebeart;
	private int anzahlGänge;
	private int maxDrehZahl;
	
	
	/** Constructor*/
	public Getriebe() /** default Constructor*/
	{
		
	}

	
	
	
	/**
	 * @param getriebeart
	 * @param anzahlGänge
	 * @param maxDrehZahl
	 */
	public Getriebe(String getriebeart, int anzahlGänge, int maxDrehZahl) {
		super();
		this.getriebeart = getriebeart;
		this.anzahlGänge = anzahlGänge;
		this.maxDrehZahl = maxDrehZahl;
	}




	/** own Methods*/
	public void schalten()
	{
		
	}




	/**
	 * @return the getriebeart
	 */
	public String getGetriebeart() {
		return getriebeart;
	}




	/**
	 * @param getriebeart the getriebeart to set
	 */
	public void setGetriebeart(String getriebeart) {
		this.getriebeart = getriebeart;
	}




	/**
	 * @return the anzahlGänge
	 */
	public int getAnzahlGänge() {
		return anzahlGänge;
	}




	/**
	 * @param anzahlGänge the anzahlGänge to set
	 */
	public void setAnzahlGänge(int anzahlGänge) {
		this.anzahlGänge = anzahlGänge;
	}




	/**
	 * @return the maxDrehZahl
	 */
	public int getMaxDrehZahl() {
		return maxDrehZahl;
	}




	/**
	 * @param maxDrehZahl the maxDrehZahl to set
	 */
	public void setMaxDrehZahl(int maxDrehZahl) {
		this.maxDrehZahl = maxDrehZahl;
	}

	
	
	
	
	

}
