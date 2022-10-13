import java.util.Scanner;
class Octal_Binary
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0,x=0;
        while(n>0)
        {
            int temp=n%10;
            n=n/10;
            dec+=temp*(int)Math.pow(8,x);
            x++;
        }
        int[] bin=new int[100];
        int l=0;
        while(dec>0)
        {
            int r=dec%2;
            dec=dec/2;
            bin[l++]=r;
        }
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(bin[i]);
        }
    }
}