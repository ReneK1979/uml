/**
 * 
 * @author Rene.KOESSLER
 *
 */
public class Getriebe {
	/** Attribute*/
	private String getriebeart;
	private int anzahlG�nge;
	private int maxDrehZahl;
	
	
	/** Constructor*/
	public Getriebe() /** default Constructor*/
	{
		
	}

	
	
	
	/**
	 * @param getriebeart
	 * @param anzahlG�nge
	 * @param maxDrehZahl
	 */
	public Getriebe(String getriebeart, int anzahlG�nge, int maxDrehZahl) {
		super();
		this.getriebeart = getriebeart;
		this.anzahlG�nge = anzahlG�nge;
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
	 * @return the anzahlG�nge
	 */
	public int getAnzahlG�nge() {
		return anzahlG�nge;
	}




	/**
	 * @param anzahlG�nge the anzahlG�nge to set
	 */
	public void setAnzahlG�nge(int anzahlG�nge) {
		this.anzahlG�nge = anzahlG�nge;
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
