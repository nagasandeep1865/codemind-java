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
        float res;
        res=(float)s/n;
        System.out.printf("%.2f",res);
    }
}