import java.util.Scanner;
class Array
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
        int s=0;
        for(i=0;i<n;i++)
        {
            s+=x[i];
            if(x[i]==a)
            {
                break;
            }
        }
        System.out.println(s);
    }
}