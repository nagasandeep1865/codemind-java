import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int x[],y[];
        x=new int[a];
        y=new int[b];
        for(int i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<b;j++)
        {
            y[j]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            int c=0;
            for(int j=0;j<b;j++)
            {
                 if(x[i]==y[j])
                 {
                     c++;
                 }
            }
            if(c==0)
            {
                System.out.print(x[i]+" ");
            }
        }
        for(int j=0;j<b;j++)
        {
            int c=0;
            for(int i=0;i<a;i++)
            {
                 if(y[j]==x[i])
                 {
                     c++;
                 }
            }
            if(c==0)
            {
                System.out.print(y[j]+" ");
            }
        }
    }
}