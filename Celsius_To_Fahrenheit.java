import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        float f;
        a=sc.nextInt();
        f=(float)(32+(a*1.8));
        System.out.format("%.2f",f);
    }
}