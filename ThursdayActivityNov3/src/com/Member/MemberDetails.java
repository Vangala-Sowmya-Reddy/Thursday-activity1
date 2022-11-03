package com.Member;
class Member
{
	String name;
	int age;
	double phonenum;
	String address;
	double salary;
	Member(String n,int a,double p,String ad,double sa)
	{
		name=n;
		age=a;
		phonenum=p;
		address=ad;
		salary=sa;
	}
	void printsalary()
	{
		System.out.println("Salary of the member is "+salary);
	}
}
class Employee extends Member
{
	String specialization;
	String department;
   Employee(String n,int a,double p,String ad,double sa,String sp,String d)
	{
		super(n,a,p,ad,sa);
		specialization=sp;
		department=d;
	}
   void displayinfo()
   {
	   System.out.println("Details of Employee: ");
	   System.out.println(name+","+age+","+phonenum+","+address+","+specialization+","+department);
   }
	
}
class Manager extends Member
{
	String specialization;
	String department;
	Manager(String n,int a,double p,String ad,double sa,String sp,String d)
	{
		super(n,a,p,ad,sa);
		specialization=sp;
		department=d;
	}
	 void displayinfo()
	   {
		   System.out.println("Details of Manager: ");
		   System.out.println(name+","+age+","+phonenum+","+address+","+specialization+","+department);
	   }
}
public class MemberDetails {

	public static void main(String[] args) {
		Employee e=new Employee("kavya",22,57869,"Hyderabad-Telangana",100000,"java developer","Information Technology");
		e.displayinfo();
		e.printsalary();
		System.out.println("------------------------------------------------------------------");
		Manager m=new Manager("sowmya",25,56437,"Proddatur-AndhraPradesh",200000,"Manager","Administration");
		m.displayinfo();
		m.printsalary();
		
	}

}
