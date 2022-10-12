import java.util.Scanner;
class Sum
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
        y[0]=x[0];
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
         int min=y[0];
         int max=0;
         int k=0;
        for(int j=0;j<l;j++)
        {
            int s=0;
            for(i=0;i<n;i++)
            {
                if(y[j]==x[i])
                {
                    s++;;
                }
            }
            if(s==y[j])
            {
                k++;
               if(max<y[j])
               {
                max=y[j];
               }
               else
               {
                   min=y[j];
               }
            }
        }
        if(k==0)
        {
            System.out.println("-1");
        }
        else
        {
        System.out.print(min+" "+max);
        }
    }
}