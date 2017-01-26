import java.util.Scanner;
public class project3ioBonus{
	public static void main(String[]args){
	
		System.out.print("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int i = intValue();
			
			
		for( int i=1; i<10; i+=2 ){
		
			for( int k = 0;k<(4-i/2); k++ ){
		
				System.out.print(" ");
				}
			for( int j = 1; j<i; j++ ){
		
				System.out.print("*");
				}
			System.out.println("");
		}

	}



}