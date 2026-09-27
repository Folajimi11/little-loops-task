import java.util.Scanner;

	public class UserInput{
	
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Enter a number: ");
			
			int number = input.nextInt();
			
			for(int index = 1; index <= number; index++){
			
				System.out.print(index + ", ");
			}
		}
	}
