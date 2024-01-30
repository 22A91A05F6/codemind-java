import java.util.Scanner;
public class vi{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=a*5;
        int y=b*10;
        int k=(x+y)/c;
        System.out.println(k);
    }
}