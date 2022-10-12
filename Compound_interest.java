import java.util.*;
class Compound
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t;
        double d,s,l;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        d=1+(r/100);
        s=Math.pow(d,t);
        l=p*s;
        System.out.printf("%.2f",l);
    }
}