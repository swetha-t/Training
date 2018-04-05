package com.book.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.book.bean.Book;
import com.book.exception.AuthorNotFoundException;
import com.book.exception.CategoryNotFoundException;

public class BookImpl implements BookInter {

	List<Book> bookList= new ArrayList<>();
	
	public void addBook(Book book) {
		   bookList.add(book);
		
	}

	public List<Book> getallBooks() {
Collections.sort(bookList,(book1,book2)->{
	return book1.getBookname().compareTo(book2.getBookname());
});
		return bookList;
	}

	public List<Book> getBookByAuthor(String author) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> getBookByCategory(String category) throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
