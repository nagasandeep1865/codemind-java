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
        int[] q=new int[100];
        int h=0;
        q[h]=x[0];
        for(int i=0;i<a;i++)
        {
            int d=0;
            for(int u=0;u<h;u++)
            {
                if(q[u]==x[i])
                {
                    d++;
                }
            }
            if(d==0)
            {
                q[h++]=x[i];
            }
        }
        int c=0;
        for(int u=0;u<h;u++)
        {
            for(int j=0;j<b;j++)
            {
                 if(y[j]==q[u])
                 {
                     c++;
                     break;
                 }
            }
        }
        System.out.println(c);
        
    }
}