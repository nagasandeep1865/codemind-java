import java.util.Scanner;
class polygon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a=(n*(n-3)/2);
        System.out.print(a);
    }
}