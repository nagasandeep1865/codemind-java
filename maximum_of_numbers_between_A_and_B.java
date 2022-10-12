import java.util.*;
class Min
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] q=new int[100];
        int l=0;
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                q[l++]=x[i];
            }
        }
        int max=q[0],c=0;
        for(int j=0;j<l;j++)
        {
            if(max<q[j])
            {
                max=q[j];
            }
            c++;
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(max);
        }
        
    }
}