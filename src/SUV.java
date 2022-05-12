/**
 * 
 * @author Rene.KOESSLER
 *
 */
public class SUV extends Fahrzeug {
	//* Attribute
	private boolean allrad;
	private String karosserie;
	private int bodenfreiheit;
	
	/** Constructor*/
	public SUV()
	{
		
	}
	
	
	/**Methods getter and setter*/

	public boolean isAllrad() {
		return allrad;
	}

	public void setAllrad(boolean allrad) {
		this.allrad = allrad;
	}

	public int getBodenfreiheit() {
		return bodenfreiheit;
	}

	public void setBodenfreiheit(int bodenfreiheit) {
		this.bodenfreiheit = bodenfreiheit;
	}

	public String getKarosserie() {
		return karosserie;
	}

	public void setKarosserie(String karosserie) {
		this.karosserie = karosserie;
	}
	
	/** own Methods*/
	public void berganfahrhilfe() 
	{
		
	}
	
	public void klimatisieren() 
	{
		
	}

}
