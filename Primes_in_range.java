import java.util.Scanner;

public class Vij{
    static boolean isprime(int k)
    {
        if(k<=1)
        {
            return false;
        }
        else
        {
        for(int j=2;j<=(int)Math.sqrt(k);j++)
        {
            if(k%j==0)
            {
                return false;
            }
    
        }
        }
        return true;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for(int i=a;i<=b;i++)
            {
                if(isprime(i))
                {
                    c++;
                }
            }
        System.out.println(c);
    }
}