import java.util.Scanner;
class Wave
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int c=0;
        for(i=1;i<n-1;i+=2)
        {
            if((x[i-1]<x[i] && x[i]>x[i+1]) || (x[i-1]>x[i] && x[i]<x[i+1]))
            {
                continue;
            }
            else
            {
                c=1;
            }
        }
        if(c==1)
        {
            System.out.print("no");
        }
        else
        {
            System.out.print("yes");
        }
    }
}