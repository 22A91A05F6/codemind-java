import java.util.Scanner;
public class Smith{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    int temp=p;
    int s=0;
    while(p!=0)
    {
        int r=p%10;
        s=s*10+r;
        p=p/10;
    }
if(temp==s)
{
    System.out.println("2");
    
}
else
{
    System.out.println("1");
}
}
}
