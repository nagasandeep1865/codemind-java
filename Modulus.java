import java.util.*;
class Tenet
{
    public static void main(String args[])
    {
        int g,n,s;
        Scanner sc=new Scanner(System.in);
        g=sc.nextInt();
        n=sc.nextInt();
        s=g%n;
        System.out.println(s);
    }
}