/**
 * @author Murat Öztürk
 */
public class HelloWorld {
    public static void main(String[] args) {
     	String str = "Hello World! :)"; // eine Referenzvariable vom Typ String deklarieren und ein Wert zuweissen.
		int counter = 1; // eine pirimitive Variable vom Typ int deklarieren und integerliteral 1
						// zuweissen
		while (counter <= 5) { // eine Schleife, um oben zugewiesene Stringiteral "Hello World" 5 mal
							  // auszugeben

		System.out.println(str + " - " + counter); // Referenz- und pirimitive Variable ausgeben
		counter++; // Zähler inkrementieren
		}
        
    }
}
