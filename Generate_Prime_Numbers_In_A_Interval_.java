import java.util.Scanner;
public class Vi{
    static boolean isprime(int k){
        int j;
        if(k<=1)
        {
            return false;
        }
        for(j=2;j<=(int)Math.sqrt(k);j++)
        {
            if(k%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        for( i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                System.out.format("%d
",i);
            }
        }
    }
}