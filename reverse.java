import java.util.*;
public class reverse{

public static void main(String args[])
{

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string:");
     String s1=sc.nextLine();
     String s2="";
     char ch;
     //int j=0;
     for(int i=s1.length()-1;i>=0;i--)
     {
     	ch=s1.charAt(i);
     	s2=s2+ch;
     	 //nstr= ch+nstr; 
     	//j++;
     }
     //if(s1.equals(s2))
      //System.out.println("palindrome");
     System.out.println(s2);
  }}
