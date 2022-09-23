import java.util.*;
class Tenet
{
    public static void main(String args[])
    {
        int t,s,b,x;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        x=(t*s*b)*2*512;
        System.out.println(x);
    }
}