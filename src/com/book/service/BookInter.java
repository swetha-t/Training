package com.book.service;

import java.util.List;

import com.book.bean.Book;
import com.book.exception.AuthorNotFoundException;
import com.book.exception.CategoryNotFoundException;

public interface BookInter {
	
	void addBook(Book book);
	List<Book> getallBooks();
	List<Book> getBookByAuthor(String author) throws AuthorNotFoundException;
	List<Book> getBookByCategory(String category) throws CategoryNotFoundException;

}
