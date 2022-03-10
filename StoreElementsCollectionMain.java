/**
 * Phoenix Mar. 10, 2022 
 *
 */


package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

class StoreElementsInCollection{
	
	public static List<String> list = new ArrayList<>();
	static void storeElements(String input) {
		
		Consumer<String> consumer = e -> list.add(e);
		String result = "";
		
		for(String s : input.split(",")) {
			consumer.accept(s.trim());
		}
		
		Supplier<List<String>> supplier = () -> list;
		for(String s : supplier.get()) {
			if(s.equals("cheese sandwich") || s.equals("corn sandwich") || s.equals("mix veg sandwich")) {
				result += s + "\n";
			}else {
				result = "Incorrect Input";
				break;
			}
		}
		System.out.println(result);
	}
}
public class StoreElementsCollectionMain {
	public static void main(String... args) {
		String one = "cheese sandwich, corn sandwich";
		String two = "corn sandwich, crap sandwich";
		
		StoreElementsInCollection.storeElements(one);
		StoreElementsInCollection.storeElements(two);
	
	}

}
