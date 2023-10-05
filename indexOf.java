import java.util.*;
public class indexOf{

public static void main(String args[])
{

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string:");
     String s1=sc.nextLine();
     System.out.println("Enter the charcter:");
     char ch=sc.next().charAt(0);
     int c=0;
     int t=s1.indexOf(ch);
  while(t!=-1){
     
        t=s1.indexOf(ch,t+1);
        c++;	
    }
     
	 
    	 
    	 
     
     System.out.println("No.of char=="+c);
}
}
