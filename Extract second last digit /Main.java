import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int l=(n%100)/10;
      	System.out.println(l);
	}
}