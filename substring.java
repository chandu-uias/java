import java.util.*;
public class substring{

public static void main(String args[])
{

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string1:");
     String s1=sc.nextLine();
      
       System.out.println("Enter the string2:");
       String s2=sc.nextLine();
       System.out.println(s1.endsWith(s2));
       System.out.println(s1.startsWith(s2));
       System.out.println("Enter the starting indexof substring");
      int i=sc.nextInt();
       System.out.println("the substring:"+s1.substring(s2));
       
     
}
}
