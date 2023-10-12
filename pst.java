import java.util.*;
class person
{
	String name,Address;
	/*person(String name,String Address)
	{
		this.name=name;
		this.Address=Address;
	}
	 void getname()
	{
		System.out.println("name:"+name);
	}
	 void getAddress()
	{
		System.out.println("Address:"+Address);
	}*/
	
}
class student extends person{


	student(String name,String Address)
	{
		super.name=name;
		super.Address=Address;
	}
	
	  ArrayList<String> courses = new ArrayList<String>();
        ArrayList<Integer> grades= new ArrayList<Integer>(); 
	void ADD(String s,int t)
{
	courses.add(s);
	grades.add(t);
}
void print()
{
	for(int i=0;i<courses.size();i++)
	{
		System.out.print(courses.get(i)+" ");
	}
	System.out.println();
	int sum=0;
	for(int i=0;i<grades.size();i++)
	{
		sum+=grades.get(i);
		System.out.print(grades.get(i)+" ");
	}
	System.out.println();
	System.out.println("Average grade:"+(sum/grades.size()));
}
}
class teacher extends person{
	teacher(String name,String Address)
	{
		super.name=name;
		super.Address=Address;
	}
	int n=0;
	ArrayList<String> courses = new ArrayList<String>();
        ArrayList<Integer> grades= new ArrayList<Integer>(); 
        	void ADD(String s,int t)
{
	n++;
	if(n<=5){
	courses.add(s);
	grades.add(t);}
	
}

void rem(String s)
{
	courses.remove(String.valueOf(s));	
}
void print()
{
	for(int i=0;i<courses.size();i++)
	{
		System.out.print(courses.get(i)+" ");
	}
}
}



public class pst{
	public static void main(String args[])
	{
		
		System.out.println("Enter the name and address:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String Address=sc.next();
		//person p=new person(name,Address);
		//p.getname();
		//p.getAddress();
		student s=new student(name,Address);
		System.out.println("Enter the number of courses:");
	int n=sc.nextInt();
	System.out.println("Enter the course names and grades:");
		for(int i=0;i<n;i++)
	{
		String st=sc.next();
		int t=sc.nextInt();
		s.ADD(st,t);
	
	}
		s.print();
		teacher tc=new teacher(name,Address);
		System.out.println("Enter the course names and grades for teacher:");
		for(int i=0;i<n;i++)
	{
		String st=sc.next();
		int t=sc.nextInt();
		tc.ADD(st,t);
	
	}
	System.out.println("Enter the no.of courses want to remove:");
	int v=sc.nextInt();
	
	for(int i=0;i<v;i++){
	System.out.println("Enter the remove course:");
	String str=sc.next();
		tc.rem(str);
	}
	tc.print();
}
}
