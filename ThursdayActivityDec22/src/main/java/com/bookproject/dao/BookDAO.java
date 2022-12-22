package com.bookproject.dao;


import java.sql.SQLException;
import com.bookproject.entity.Book;

public interface BookDAO {
	void createTable();
	boolean insertBook(Book b);
	
	void deleteBook();
	//int updateBook() throws SQLException;
}
