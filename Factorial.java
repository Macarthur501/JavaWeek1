
public class Factorial {

	public static void main(String[] args) {
		reverseFactorialCalculator(720);

	}

	public static void reverseFactorialCalculator(int number) {
		boolean sum = true;
		int i = 1;
		int origNumber = number;
		
		while (sum) {
			i++;
			if (number % i == 0) {
				number = number / i;
				//System.out.println(number);
				if ( number == 1) {
					System.out.println(origNumber + " = " + i + "!");
					sum = false;
				}
				else {
					
				}
				}
			else {
				System.out.println(origNumber + " NONE");
				sum = false;
				
			}
			}
			
		}
		
		
	}

