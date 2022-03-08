/**
 * Phoenix Mar. 8, 2022 
 *
 */

package java8;

interface CitrusFruits{
	int totalFruits(int oranges, int lemons, int grapefruits);
}

public class One {
	
	public static void main(String[] args) {
		CitrusFruits cit = new CitrusFruits() {
			public int totalFruits(int oranges, int lemons, int grapefruits) {
				return oranges + lemons + grapefruits;
			}
		};
		System.out.println(cit.totalFruits(5, 10, 15));
		
		
		// with lambda
		CitrusFruits cit2 = (orange, lemon, grape) -> orange + lemon + grape;
		System.out.println(cit2.totalFruits(2,4,8));
		
		// runnable without lambda
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("This thread is running");
			}
		}).start();
		
		// runnable with lambda
		new Thread( () -> System.out.println("Lambda is running")).start();
		
		
	}

}
