import java.util.Scanner;
public class Vijaya
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int s=0;
    int r;
    int temp;
    temp=a;
   while (a>0)
   {
       r=a%10;
       s=s*10+r;
       a=a/10;
   }
   if(temp==s)
   {
       System.out.println("True");
   }
   else
   {
       System.out.println("False");
   }
}
}