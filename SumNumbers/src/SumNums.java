import java.util.Scanner;


public class SumNums {
	
	public static void main(String[]args) {
		
		System.out.println("PLease Enter A Number: ");
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int sum = 0;
		
		while ( N < 1 ) {
			
			System.out.println("Please enter a number greater than 1 **");
		
		}
		
		for ( int num = 1; num < N ; num++  ) {
			 
			sum = sum + num;
			
		}
		
			System.out.println("The sum of the numbers is 1 to " + N + " is equal to " + sum );
			
		}
	
		Scanner.close();
		
		
	}
	
