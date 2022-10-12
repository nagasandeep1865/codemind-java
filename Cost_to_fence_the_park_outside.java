import java.util.*;
class Park
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,c;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        int a=(l+2*w)*(b+2*w)-(l*b);
        int s=a*c;
        System.out.println(s);
    }
}