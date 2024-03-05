import java.util.Scanner;
public class Vij{
    static boolean  ispalindrom(int k)
    {
        int r;
        int temp=k;
        int s=0;
        while(k>0)
        {
            r=k%10;
            s=s*10+r;
            k=k/10;
        }
        if(temp==s)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(ispalindrom(arr[i]))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}