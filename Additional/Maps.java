import java.util.*;

public class Maps {
	public static void main(String[] args) {
		HashMap<String, Integer> empIds = new HashMap<>();
	
		empIds.put("John", 12345);
		empIds.put("Carl", 54321);
		empIds.put("Jerry", 8675309);

		// Will print out the entire map displaying the key and value pairing
		System.out.println(empIds);
		
		// Will print out the value for Carl 54321		
		System.out.println(empIds.get("Carl"));

		// Will return and print true since Jerry is in the map
		System.out.println(empIds.containsKey("Jerry"));

		// Will return and print false since Geo is not in the map
		System.out.println(empIds.containsKey("Geo"));

		// We can also check to see if a certain value is in the map
		System.out.println(empIds.containsValue(6));

		// Returns true
		System.out.println(empIds.containsValue(8675309));
		
		// overrides the current value for the key john
		empIds.put("John", 98765);
		
		System.out.println(empIds);
	}
}	
