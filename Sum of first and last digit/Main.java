import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int number, first_digit, last_digit;
		Scanner s = new Scanner(System.in);
		
		//System.out.print(" Please Enter any Number that you wish : ");
		number = s.nextInt();	
		
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = number % 10;
		int t=first_digit+last_digit;
		System.out.println(t);
	}
}
	
