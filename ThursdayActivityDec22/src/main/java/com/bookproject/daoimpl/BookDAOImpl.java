package com.bookproject.daoimpl;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.bookproject.dao.BookDAO;
import com.bookproject.dbconfig.DBConfig;
import com.bookproject.entity.Book;

public class BookDAOImpl implements BookDAO{
	static Connection con;
	static Statement s;
	static
	{
		try
		{
			con=DBConfig.makeConnection();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void createTable()
	{
		try
		{
		
			Statement st=con.createStatement();
			st.executeUpdate("create table book1(book_id int primary key,book_name varchar(20),book_author varchar(20),book_description varchar(30),book_price double,book_url varchar(35))");
			System.out.println("Table is successfully created");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public boolean insertBook(Book b)
	{
		boolean bo=false;
		try
		{
			con.setAutoCommit(false);
			PreparedStatement ps=con.prepareStatement("insert into book1 values(?,?,?,?,?,?)");
			ps.setInt(1,b.getBookId());
			ps.setString(2,b.getBookName());
			ps.setString(3,b.getBookAuthor());
			ps.setString(4,b.getDescription());
			ps.setDouble(5,b.getBookPrice());
			ps.setString(6,b.getBookUrl());
	        int rowsAffected=ps.executeUpdate();
	       if(rowsAffected >0)
	        {
	        	bo=true;
	        	con.commit();
	        }
	       else
	       {
	    	   bo=false;
	       }
		}
	       catch(SQLException e)
	       {
	    	   System.out.println(e); 
	       }
	       return bo;
			
		}
		public void deleteBook()
		{
			try
			{
				
				PreparedStatement ps=con.prepareStatement("delete from book1 where book_name='java'");
				ps.executeUpdate();
				System.out.println("Book is deleted successfully");
			}
		       catch(SQLException e)
		       {
		    	   System.out.println(e); 
		       }
			
		}
		
		/*public int updateBook() throws SQLException
		{
			PreparedStatement ps=con.prepareStatement("update book1 set book_name='Health is Wealth' where book_id=20");
			int rowsUpdated=ps.executeUpdate();
			System.out.println("number of rows updated is "+rowsUpdated);
			return rowsUpdated;
		}*/

		

		
	}
	


