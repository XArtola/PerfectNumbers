/**
 * 
 */
import java.util.Scanner;
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
		
		System.out.println("Enter 10 numbers");
		
		int a = 360;
		int b = 2;
		
		while (a >1) {
			
			while(a % b != 0) {
				
				b++;
				
			}
			
			a = a/b;
			System.out.println(b);
			
		}
		
		System.out.println(a);	
		
	}

}
