/**
 * Phoenix Mar. 8, 2022 
 *
 */


package java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeComposite_Factorial {
	
	
	static ArrayList<String> list = new ArrayList<>();
	Consumer<String> consumer = t -> System.out.println(t);
	void primeOrComposite(int n) {
	
		String ans = "";
		IntPredicate predicate = div -> n % div == 0;
		if(n == 1 || n == 0) ans = "Neither Prime nor Composite";
		else if(n > 1 && IntStream.range(2,  n-1).noneMatch(predicate)) {
			ans = "Prime";
		}else {
			ans = "Composite";
		}
		
		list.add(ans);
		

	}
	
	void findFactorial(int n) {
		long val = 1;
		if(n > 0) {
		for(int i = n-1; i >= 1; i--) {
			val = val * i;
		}
		}
		list.add(String.valueOf(val));
		list.forEach(consumer);
		
	}
	
	public static void main(String[] args) {
		PrimeComposite_Factorial xyz = new PrimeComposite_Factorial();
		int n = 7;
		xyz.primeOrComposite(0);
		xyz.findFactorial(0);
		
	}
	
}
