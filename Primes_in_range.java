import java.util.*;
class Prime
{
    public static boolean isprime(int n)
    {
        int i;
        if(n<2)
        {
            return false;
        }
        for(i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c=0;
        for(int j=a;j<=b;j++)
        {
            if(isprime(j))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}