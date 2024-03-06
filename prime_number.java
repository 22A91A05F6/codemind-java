import java.util.Scanner;
public class Vij{
public static void main(String[] args)
{
 //nner  c=new Scanner(System.in);
 Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int i;
    int c=0;
    for(i=1;i<=a;i++)
    {
        if(a%i==0)
        {
            c++;
        }
    }
    if(c==2)
    {
        System.out.println("prime");
        
    }
    else
    {
        System.out.println("not a prime");
    }
}
}