package com.BookAndAuthor;

public class BookDetails {
	static void display(Book b) {
		System.out.println("Book type : " + b.getBookType());
		System.out.println("Book Author name : " + b.getAr());
		System.out.println("Book price : " + b.getPrice());
		System.out.println("Year of publictaion of Book: " + b.getYearOfPublication());

	}

	public static void main(String[] args) {
		
		Book b = new Book("Fiction Books", 2020,199.00, new Author("Sowmya Reddy ,", 25));
		display(b);
	}

}
