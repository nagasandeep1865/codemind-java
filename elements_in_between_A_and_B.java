import java.util.Scanner;
class Element
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
        int c=0;
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                System.out.print(x[i]+" ");
                c=1;
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    }
}