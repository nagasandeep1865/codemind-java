import java.util.*;
class Tenet
{
    public static void main(String args[])
    {
        int i,a,n[],s=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        n=new int[a];
        for(i=0;i<a;i++)
        {
            n[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
           s+=n[i]; 
        }
        System.out.println(s);
    }
}