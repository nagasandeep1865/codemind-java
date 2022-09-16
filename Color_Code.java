import java.util.*;
class Tenet
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char a;
      a=sc.nextLine().charAt(0);
      if(a=='v'||a=='V')
      {
          System.out.println("Violet");
      }
      else if(a=='i' || a=='I')
      {
          System.out.println("Indigo");
      }
      else if(a=='b'|| a=='B')
      {
          System.out.println("Blue");
      }
       else if(a=='g'|| a=='G')
      {
          System.out.println("Green");
      }
       else if(a=='y'|| a=='Y')
      {
          System.out.println("Yellow");
      }
       else if(a=='o'|| a=='O')
      {
          System.out.println("Orange");
      }
       else if(a=='r'|| a=='R')
      {
          System.out.println("Red");
      }
      else
      System.out.println("-1");
    }
}
