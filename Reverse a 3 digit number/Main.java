import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int n,r=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
   // int r=s.nextInt();
    while(n!=0)
    {
     r=r*10;
     r=r+n%10;
      n=n/10;
    }
    System.out.println(r);
  }
}