import java.util.Scanner;
class Prime
{
    public static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int ele:x)
        {
            if(prime(ele))
            {
                if(ele>=k)
                {
                  c++;  
                }
                
            }
        }
        System.out.println(c);
    
    }
}