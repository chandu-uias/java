import java.util.*;
public class vowel{

public static void main(String args[])
{

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string:");
     String s1=sc.nextLine();
     //System.out.println(s1.charAt(0));
     int v=0,c=0;
     char ch;
     for(int i=0;i<s1.length();i++)
     {
     	ch=s1.charAt(i);
     	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='E'||ch=='O'||ch=='U')
     	{
     	   System.out.println(ch);
     	   v++;	
	}
	else
	{
		c++;
	}
     }
     System.out.println("vowel count=="+v);
     System.out.println("consonants count=="+c);
}
}
