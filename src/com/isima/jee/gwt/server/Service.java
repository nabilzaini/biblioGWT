package com.isima.jee.gwt.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.isima.jee.gwt.client.service.ServiceInterface;
import com.isima.jee.ws.Author;
import com.isima.jee.ws.BiblioService;
import com.isima.jee.ws.BiblioServiceService;
import com.isima.jee.ws.Book;

@SuppressWarnings("serial")
public class Service extends RemoteServiceServlet implements ServiceInterface {
	
	private BiblioService s;
	
	public Service() {
		s = (new BiblioServiceService()).getBiblioServicePort();
	}

	public int addBook(int arg0, String arg1, double arg2, String arg3) {
		return s.addBook(arg0, arg1, arg2, arg3);
	}

	public boolean editBook(int arg0, String arg1, double arg2, String arg3) {
		return s.editBook(arg0, arg1, arg2, arg3);
	}

	public boolean deleteBook(int arg0) {
		return s.deleteBook(arg0);
	}

	public Book getBook(int arg0) {
		return s.getBook(arg0);
	}

	public List<Book> findBook(String arg0, String arg1) {
		return s.findBook(arg0, arg1);
	}

	public List<Book> allBooks() {
		return s.allBooks();
	}

	public Author getAuthorOfBook(int arg0) {
		return s.getAuthorOfBook(arg0);
	}

	public int addAuthor(String arg0, String arg1, String arg2) {
		return s.addAuthor(arg0, arg1, arg2);
	}

	public boolean editAuthor(int arg0, String arg1, String arg2, String arg3) {
		return s.editAuthor(arg0, arg1, arg2, arg3);
	}

	public boolean deleteAuthor(int arg0) {
		return s.deleteAuthor(arg0);
	}

	public Author getAuthor(int arg0) {
		return s.getAuthor(arg0);
	}

	public List<Author> findAuthor(String arg0, String arg1) {
		return s.findAuthor(arg0, arg1);
	}

	public List<Author> allAuthors() {
		return s.allAuthors();
	}

	public List<Book> getBooksByAuthor(int arg0) {
		return s.getBooksByAuthor(arg0);
	}
}
