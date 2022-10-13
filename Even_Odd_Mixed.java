import java.util.*;
class EvenOdd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int b=a,c=0;
        while(b!=0)
        {
            b=b/10;
            c++;
        }
        int r,e=0,o=0;
        while(a!=0)
        {
            r=a%10;
            if(r%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            a=a/10;
        }
        if(e==c)
        {
            System.out.print("Even");
        }
        else if(o==c)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
}