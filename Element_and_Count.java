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
        int[] arr2=new int[100];
        int l=0;
        arr2[l++]=x[0];
       for(i=0;i<n;i++)
       {
           int c=0;
           for(int k=0;k<l;k++)
           {
               if(arr2[k]==x[i])
               {
                   c++;
               }
           }
           if(c==0)
           {
               arr2[l++]=x[i];
           }
       }
       int y=0;
       for(int p=0;p<l;p++)
       {
           int s=0;
           for(i=0;i<n;i++)
           {
               if(arr2[p]==x[i])
               {
                   s++;
               }
           }
           System.out.print(arr2[p]+" "+s+" ");
           y++;
       }
       if(y==0)
       {
           System.out.println("-1");
       }
       
    }
}