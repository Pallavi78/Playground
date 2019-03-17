import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    int n,i;
      Scanner s=new Scanner(System.in);
      //System.out.println();
      n=s.nextInt();
      for(i=1;i<=n;i++)
      {
        if(n%i==0)
        {
          System.out.println(i);
        }
      }
	}
}