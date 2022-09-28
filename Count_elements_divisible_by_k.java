import java.util.Scanner;
class Tenet
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,a;
        n=sc.nextInt();
        x=new int[n];
        a=sc.nextInt();
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int c=0;
        for(int ele:x)
        {
            if(ele%a==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}