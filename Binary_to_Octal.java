import java.util.Scanner;
public class Parse{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int i;
        for(i=1;i<=p;i++)
        {
            String j=sc.next();
       // }
        //for(i=1;i<=p;i++)
        //{
            int l=Integer.parseInt(j,2);
             //int k=Integer.toOctalString(l);
            System.out.println(Integer.toOctalString(l));
        }
    }
}