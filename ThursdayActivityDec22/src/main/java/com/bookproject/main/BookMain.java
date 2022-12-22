package com.bookproject.main;

import java.sql.*;
import java.sql.SQLException;

import com.bookproject.daoimpl.BookDAOImpl;
import com.bookproject.dbconfig.DBConfig;
import com.bookproject.entity.Book;

public class BookMain {

	public static void main(String[] args) throws SQLException {
		BookDAOImpl bdao= new BookDAOImpl();
		DBConfig.makeConnection();
		bdao.createTable();
		System.out.println("Inserting data into database");
		Book b1=new Book(10,"Java","Satish","Learning java is easy",499.00,"http//:java");
		Book b2=new Book(20,"Yoga and Life","Danvitha","Yoga is everything",599.00,"http//:yoga and life");
		Book b3=new Book(30,"Peacefulness","Sowmya","Peace of mind",799.00,"http//:Peacefulness");
		Book b4=new Book(40,"Ayurveda","Maharshi","Ayurveda is a lifestyle",999.000,"http//:Ayurveda and lifestyle");
		
		
		bdao.insertBook(b1);
		bdao.insertBook(b2);
		bdao.insertBook(b3);
		bdao.insertBook(b4);
		bdao.deleteBook();
		//bdao.updateBook();
		
		
	}

}

