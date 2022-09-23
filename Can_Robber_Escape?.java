import java.util.*;
class Tenet
{
    public static void main(String args[])
    {
        int a,i,arr[],odd=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        arr=new int[a];
        for(i=0;i<a;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(arr[i]%2!=0)
            odd++;
        }
        if(odd<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}