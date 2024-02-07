import java.util.Scanner;
public class Vij{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
      //  int b=sc.nextInt();
        int i;
        int c=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
            //System.out.format("%d ",i);
        }
        if(c==2)
        {
         System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
} 
        
    
