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
 //nner  c=new Scanner(System.in);
 Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int[] arr=new int[a];
    
    int i;
    int c=0;
    for(i=0;i<a;i++)
    {
        arr[i]=sc.nextInt();
    }
    int b=sc.nextInt();
    for(i=0;i<a;i++)
    {
        if(arr[i]>=b)
        {
        if(isprime(arr[i]))
        {
            c++;
        }
    }
    }
    System.out.println(c);
}
}