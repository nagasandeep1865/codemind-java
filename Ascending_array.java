import java.util.Scanner;
class Descending
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
        for(i=0;i<n-1;i++)
        {
            if(x[i]>=x[i+1])
            {
                c++;
            }
        }
        if(c>0)
        {
            System.out.print("no");
        }
        else
        {
            System.out.print("yes");
        }
    }
}