/**
 * 
 * @author Rene.KOESSLER
 *
 */
public class Main {

	public static void main(String[] args) {
		
	
	PKW bmw = new PKW(4, 2, true, "Schwarz", 240, 6, "Benzin", "Automatikschaltung", 6, 2500, "BMW", "7", 2015);
	
	
	
	System.out.println("Ein Fahrzeug des Typs PKW der Marke " + bmw.getMarke() + ", des Modells " + bmw.getModell() 
	+ " mit " + bmw.getAnzahlReifen() + " Reifen, Baujahr " + bmw.getBaujahr());
	 
	
	
	
	
	}

}
