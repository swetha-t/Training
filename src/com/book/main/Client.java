package com.book.main;

import com.book.bean.Book;
import com.book.service.BookImpl;
import com.book.service.BookInter;

public class Client {

	public static void main(String[] args) {
		
		BookInter bookInter= new BookImpl();
		
		for(int i=0; i<5; i++){
		
		Book book = null;
		bookInter.addBook(book);
	}
		
	/*	BookInter bookInter1= new BookImpl();*/
		//bookInter.getallBooks();
}
}