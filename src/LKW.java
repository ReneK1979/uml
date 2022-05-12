/**
 * 
 * @author Rene.KOESSLER
 *
 */
public class LKW extends Fahrzeug{
	//*Attribute
	 private int gesamtGewicht;
	 private int nutzlast;
	 private  String fahrtenSchreiber;
		
	
	 /** Constructor*/
	public LKW()
	{
		
	}

	/**Methods getter and setter*/
	
	public int getGesamtGewicht() {
		return gesamtGewicht;
	}

	public void setGesamtGewicht(int gesamtGewicht) {
		this.gesamtGewicht = gesamtGewicht;
	}

	public int getNutzlast() {
		return nutzlast;
	}

	public void setNutzlast(int nutzlast) {
		this.nutzlast = nutzlast;
	}

	public String getFahrtenSchreiber() {
		return fahrtenSchreiber;
	}

	public void setFahrtenSchreiber(String fahrtenSchreiber) {
		this.fahrtenSchreiber = fahrtenSchreiber;
	}
	
	/** own Methods*/
	
	public void beladen()
	{}
	
	public void entladen()
	{}
	
	public void navigieren()
	{}
	
	
	
	

	

}
