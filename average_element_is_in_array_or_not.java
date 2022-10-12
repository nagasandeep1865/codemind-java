import java.util.Scanner;
class Element
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int s=0;
        for(int ele:x)
        {
            s+=ele;
        }
        int res=s/n;
        int c=0;
        for(i=0;i<n;i++)
        {
            if(res==x[i])
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