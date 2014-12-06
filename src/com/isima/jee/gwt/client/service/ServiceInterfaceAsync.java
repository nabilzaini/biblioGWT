package com.isima.jee.gwt.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.isima.jee.ws.Author;
import com.isima.jee.ws.Book;

public interface ServiceInterfaceAsync {

	void addAuthor(String arg0, String arg1, String arg2,
			AsyncCallback<Integer> callback);

	void addBook(int arg0, String arg1, double arg2, String arg3,
			AsyncCallback<Integer> callback);

	void allAuthors(AsyncCallback<List<Author>> callback);

	void allBooks(AsyncCallback<List<Book>> callback);

	void deleteAuthor(int arg0, AsyncCallback<Boolean> callback);

	void deleteBook(int arg0, AsyncCallback<Boolean> callback);

	void editAuthor(int arg0, String arg1, String arg2, String arg3,
			AsyncCallback<Boolean> callback);

	void editBook(int arg0, String arg1, double arg2, String arg3,
			AsyncCallback<Boolean> callback);

	void findAuthor(String arg0, String arg1,
			AsyncCallback<List<Author>> callback);

	void findBook(String arg0, String arg1, AsyncCallback<List<Book>> callback);

	void getAuthor(int arg0, AsyncCallback<Author> callback);

	void getAuthorOfBook(int arg0, AsyncCallback<Author> callback);

	void getBook(int arg0, AsyncCallback<Book> callback);

	void getBooksByAuthor(int arg0, AsyncCallback<List<Book>> callback);

}
