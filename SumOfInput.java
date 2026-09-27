import java.util.Scanner;

	public class SumOfInput{
	
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Enter a number: ");
			
			int number = input.nextInt();
			
			int sum = 0;
			
			for(int index = 1; index <= number; index++){
			
			sum = sum + index;
			
			System.out.print(index + ", ");
			}
			
			System.out.println("The sum of number is: " + sum);
			
		}
	}
