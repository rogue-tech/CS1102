
public class formloop {
	
	public static void main(String[] args) {
		/* while loop
		 * 
		 */
        System.out.println("Count while loop----------");
		int number = 1;
		while (number != 10) {
			System.out.println(number);
			number++;
		}
		System.out.println("Count do while loop----------");
		/* do while loop
		 * 
		 */
		int times = 1;
		do{
			System.out.println(times);
			times += 1;
		} while (times < 10);
		System.out.println("Count for loop----------");
		/* for loop
		 * 
		 */
		 for (int num = 1; num < 10; num++) {
			System.out.print(num + "\n");
		 }
	}
}
