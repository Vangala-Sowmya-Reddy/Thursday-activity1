package com.StudentQuestion;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import org.hibernate.cfg.Configuration;



public class StudentMain {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Student std=new Student();
		std.setRoll_no(101);
		std.setName("Sowmya Reddy");
		
		std.setMarks(99.98);
		
		Student std1=new Student(102,"Jotiswar",76.78);
		Student std2=new Student(103,"Suchi",98.67);
		Student std3=new Student(104,"Kavya",89.04);
		Student std4=new Student(105,"Madhuri",78.95);
		
		session.save(std3);
		session.save(std2);
		session.save(std1);
		session.save(std);
		
		session.save(std4);
		
		session.getTransaction().commit();

		System.out.println("1.View All Student Details 2.Update student name");
		System.out.println("3.Delete student details   4.View Specific student details");
		
		int option;
			Scanner sc=new Scanner(System.in);
			System.out.println("Select the option");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				try
				{
					Query query01=session.createQuery("from Student");
					List list=query01.list();
					System.out.println(list);
					
				}
				catch(Exception e)
				{
				System.out.println(e);
				}
			case 2:
				try
				{
					session.beginTransaction();
					Query query02=session.createQuery("update Student set name='Vasantha' where roll_no='104'");
					int list02=query02.executeUpdate();
					System.out.println("Row are updated"+list02);
					session.getTransaction().commit();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 3:
				try
				{
					int num1;
					System.out.println("Enter the roll number");
					num1=sc.nextInt();
					session.beginTransaction();
					Query query03=session.createQuery("delete from Student where roll_no="+num1 );
					int list03=query03.executeUpdate();
					session.getTransaction().commit();

				
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 4:
				try
				{
					int num2;
					System.out.println("Enter the roll number");
					num2=sc.nextInt();
					session.beginTransaction();
					Query query04=session.createQuery("from Student where roll_no="+num2);
					List list=query04.list();
					System.out.println(list);
					session.getTransaction().commit();
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 5:
				try
				{
		
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			}

	}


