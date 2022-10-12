import java.util.Scanner;
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
        for(int ele:x)
        {
            if(ele%2==0)
            {
                System.out.print(ele+" ");
            }
        }
        for(int ele:x)
        {
            if(ele%2!=0)
            {
                System.out.print(ele+" ");
            }
        }
    }
}