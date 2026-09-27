import java.util.Scanner;

	public class NumberDown{
	
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Enter a number: ");
			
			int number = input.nextInt();
			
			for(int index = number; index >= 1; index--){
			
				System.out.print(index + ", ");
				
			}
		}
		
	}
