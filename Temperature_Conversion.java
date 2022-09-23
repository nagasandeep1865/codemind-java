import java.util.*;
class Tenet
{
    public static void main(String args[])
    {
        float a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=(float)(32+(a*1.8));
        System.out.printf("%.2f",b);
    }
}