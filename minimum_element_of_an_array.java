import java.util.*;
class minimum
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
        int min=x[0];
        for(int ele:x)
        {
            if(min>ele)
            {
                min=ele;
            }
        }
        System.out.print(min);
    }
}