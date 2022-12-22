package com.bookproject;

import java.awt.print.Book;
import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
	void createTable();
	boolean insertBook(Book b);
	List<Book> getAllBooks();
	void deleteBook();
	int updateBook() throws SQLException;
}
