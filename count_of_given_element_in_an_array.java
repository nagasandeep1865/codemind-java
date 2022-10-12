import java.util.Scanner;
class count
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
        int b,s=0;
        b=sc.nextInt();
        for(int ele:x)
        {
            if(ele==b)
            {
                s++;
            }
        }
        System.out.println(s);
    }
}
