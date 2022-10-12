import java.util.*;
class Solution
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
        int s=0;
        for(i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            {
                System.out.print(x[i]+" ");
                s++;
            }
        }
        if(s==0)
        {
            System.out.print("-1");
        }
    }
}