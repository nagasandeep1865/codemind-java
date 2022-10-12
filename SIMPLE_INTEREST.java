import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        int c;
        c=(p*t*r)/100;
        System.out.println(c);
    }
}