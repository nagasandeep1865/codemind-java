import java.util.*;
class Odd
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
        int[] y=new int[100];
        int l=0;
        y[l]=x[0];
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<l;j++)
            {
                if(y[j]==x[i])
                {
                    c++;
                }
            }
            if(c==0)
            {
                y[l++]=x[i];
            }
        }
        int s=0;
        for(int j=0;j<l;j++)
        {
            if(y[j]%2!=0)
            {
                s+=y[j];
            }
        }
        System.out.println(s);
    }
}