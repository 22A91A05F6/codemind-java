import java.util.Scanner;
public class V{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b>a)
        {
            int p=b-a;
            System.out.println(p);
        }
    }
}