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
		System.out.println("Inerting data into database");
		Book b1=new Book(1,"Java","Satish","Learning java is easy",499.00);
		Book b2=new Book(2,"Yoga and Life","Danvitha","Yoga is everything",599.00);
		Book b3=new Book(3,"Peacefulness","Sowmya","Peace of mind",799.00);
		
		
		
		Book b5=new Book(5,"Ayurveda","Maharshi","Ayurveda is a lifestyle",999.000);
		
		
		bdao.insertBook(b1);
		bdao.insertBook(b2);
		bdao.insertBook(b3);
		bdao.insertBook(b5);
		bdao.deleteBook();
		bdao.updateBook();
		
		
	}

}
