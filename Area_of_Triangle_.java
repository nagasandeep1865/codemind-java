import java.util.*;
class Tenet
{
    public static void main(String args[])
    {
        float a,b,c,s,x;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2;
        x=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",x);
    }
}