
/**
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author ik013043z1
 *
 */
public class PerfectNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 different numbers");

		String number = "";
		int numberInt = 0;

		int differentNumbers = 0;

		ArrayList<Integer> numberStore = new ArrayList<Integer>();

		while (numberStore.size() < 10) {

			number = sc.next();
			number = number.trim();

			if (!(number.matches("^[0-9]+"))) {

				System.out.println("This is not a valid number try again.\n You need " + (10 - numberStore.size())
						+ " more numbers");
			}
			
			else if (numberStore.size()==0) {
				
				numberStore.add(Integer.parseInt(number));
	
			}

			else {

				numberInt = Integer.parseInt(number);
				System.out.println(numberInt);

				boolean repeated = false;

				for (int a = 0; a < numberStore.size(); a++) {

					if (numberStore.get(a) == numberInt) {

						System.out.println("This is number is already stored try again.\nYou need "
								+ (10 - differentNumbers) + " more numbers");

						repeated = true;

					}

				}

				if (!repeated) {

					numberStore.add(numberInt);

				}

			}
			
			System.out.println("Enter the next number you need " + (10 - numberStore.size()) + " more");

		}

		for (int b = 0; b < numberStore.size(); b++) {

			int sum = 0;

			for (int c = numberStore.get(b).intValue() - 1; c > 0; c--) {

				if (numberStore.get(b).intValue() % c == 0) {

					sum = sum + c;

				}

			}

			if (numberStore.get(b).intValue() == sum) {

				System.out.println(numberStore.get(b).intValue() + " is a perfect number");
				numberStore.remove(b);

			}

		}
		
		if(numberStore.size()==10) {
			
			System.out.println("There is not any perfect number");
		}

	}

}
