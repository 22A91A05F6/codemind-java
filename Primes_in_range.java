import java.util.*;
public class Vij{
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else
        {
            for(int j=2;j<=n/2;j++)
            {
                if(n%j==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                c+=1;
            
            }
        }
        System.out.println(c);
    }
}