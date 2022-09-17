import java.util.*;
class Tenet
{
    public static void main(String args[])
    {
        char x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextLine().charAt(0);
        if(x=='a'|| x=='A' || x=='e'||x=='E' || x=='i' ||x=='I'|| x=='o'||x=='O' || x=='u'||x=='U' )
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
        
    }
}