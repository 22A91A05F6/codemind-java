import java.util.Scanner;
public class Vij{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int i;
        for(i=b;i<=c;i++)
        {
            System.out.format("%d x %d = %d
",a,i,(a*i));
        }
    }
}