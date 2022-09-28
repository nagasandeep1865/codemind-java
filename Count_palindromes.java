import java.util.Scanner;
class count
{
    public static int palindrome(int n)
    {
        int r,d=0;
        while(n!=0)
        {
            r=n%10;
            d=d*10+r;
            n=n/10;
        }
        return d;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,x[],i;
        a=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        int s=0;
        for(int ele:x)
        {
            if(ele==palindrome(ele))
            {
                s++;
            }
        }
        System.out.println(s);
    }
}