import java.util.Scanner;
class array
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
        int b=sc.nextInt();
        int c=0;
        for(int ele:x)
        {
            if(ele==b)
            {
                c=1;
            }
        }
        if(c==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}