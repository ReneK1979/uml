 /**
  * 
  * @author Rene.KOESSLER
  * 
  */
public class Motor {
	/** Attribute*/
	private int leistung;
	private int kraftstoffVerbrauch;
	private String kraftstoffArt;
	
	
	/** Constructor*/
	public Motor()
	{
		
	}
	
	/**
	 * @param leistung
	 * @param kraftstoffVerbrauch
	 * @param kraftstoffArt
	 */
	protected Motor(int leistung, int kraftstoffVerbrauch, String kraftstoffArt) {
		super();
		this.setLeistung(leistung) ;
		this.setKraftstoffVerbrauch(kraftstoffVerbrauch);
		this.setKraftstoffArt(kraftstoffArt);
	}





	/** own Methods*/
	public void start()
	{
		System.out.println("der Motor startet");
	}
	
	public void stop() 
	{
		System.out.println("Der Motor ist aus");
	}




	/**
	 * @return the leistung
	 */
	public int getLeistung() {
		return leistung;
	}




	/**
	 * @param leistung the leistung to set
	 */
	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}




	/**
	 * @return the kraftstoffVerbrauch
	 */
	public int getKraftstoffVerbrauch() {
		return kraftstoffVerbrauch;
	}




	/**
	 * @param kraftstoffVerbrauch the kraftstoffVerbrauch to set
	 */
	public void setKraftstoffVerbrauch(int kraftstoffVerbrauch) {
		this.kraftstoffVerbrauch = kraftstoffVerbrauch;
	}




	/**
	 * @return the kraftstoffArt
	 */
	public String getKraftstoffArt() {
		return kraftstoffArt;
	}




	/**
	 * @param kraftstoffArt the kraftstoffArt to set
	 */
	public void setKraftstoffArt(String kraftstoffArt) {
		this.kraftstoffArt = kraftstoffArt;
	}
	

}
