import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,f=1;
//n=7;
      for(i=1;i<=n;i++)
      {
        f=f*i;
      }
      System.out.println(f);// Type your code here
	}
}