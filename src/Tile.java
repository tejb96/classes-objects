
/**
 * 
 * Contains a letter and number pair, which can be converted to a string and also compared to other letter and value pairs.
 * 
 * @author Tejpreet Bal
 * @version 1.0
 * @Date May 12, 2023
 *
 */
public class Tile {
	
	char letter;
	int value;
	
	
//	default constructor
	Tile(){
		letter = 'A';
		value = 1;
	}
	
//	constructor to initialize instance variables
	Tile(char l, int v){
		
		letter = l;
		value = v;
		
	}
	
//	returns a string representation 
	public String toString(){
		
		return letter + "["+String.valueOf(value)+"]";
				
	}
	
//	Returns true if two tile objects have the same letter and value
//	Boolean equals() {
//		
//		return tile1.equals(tile2);
//		
//	}

	public static void main(String[] args) {
		
		Tile tile0 = new Tile('A', 1);
		Tile tile1 = new Tile('A', 1);
		Tile tile2 = new Tile('Z', 10);

	}

}
