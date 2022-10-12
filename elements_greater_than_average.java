import java.util.*;
class Elements
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
        int s=0;
        for(int ele:x)
        {
            s+=ele;
        }
        int res=s/n;
        int c=0;
        for(int ele:x)
        {
            if(ele>=res)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}