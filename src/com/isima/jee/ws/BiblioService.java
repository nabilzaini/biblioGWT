
package com.isima.jee.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BiblioService", targetNamespace = "http://ws.jee.isima.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BiblioService {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addBook", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.AddBook")
    @ResponseWrapper(localName = "addBookResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.AddBookResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/addBookRequest", output = "http://ws.jee.isima.com/BiblioService/addBookResponse")
    public int addBook(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editBook", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.EditBook")
    @ResponseWrapper(localName = "editBookResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.EditBookResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/editBookRequest", output = "http://ws.jee.isima.com/BiblioService/editBookResponse")
    public boolean editBook(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteBook", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.DeleteBook")
    @ResponseWrapper(localName = "deleteBookResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.DeleteBookResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/deleteBookRequest", output = "http://ws.jee.isima.com/BiblioService/deleteBookResponse")
    public boolean deleteBook(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.isima.jee.ws.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBook", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.GetBook")
    @ResponseWrapper(localName = "getBookResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.GetBookResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/getBookRequest", output = "http://ws.jee.isima.com/BiblioService/getBookResponse")
    public Book getBook(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.isima.jee.ws.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findBook", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.FindBook")
    @ResponseWrapper(localName = "findBookResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.FindBookResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/findBookRequest", output = "http://ws.jee.isima.com/BiblioService/findBookResponse")
    public List<Book> findBook(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<com.isima.jee.ws.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "allBooks", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.AllBooks")
    @ResponseWrapper(localName = "allBooksResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.AllBooksResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/allBooksRequest", output = "http://ws.jee.isima.com/BiblioService/allBooksResponse")
    public List<Book> allBooks();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.isima.jee.ws.Author
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAuthorOfBook", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.GetAuthorOfBook")
    @ResponseWrapper(localName = "getAuthorOfBookResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.GetAuthorOfBookResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/getAuthorOfBookRequest", output = "http://ws.jee.isima.com/BiblioService/getAuthorOfBookResponse")
    public Author getAuthorOfBook(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addAuthor", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.AddAuthor")
    @ResponseWrapper(localName = "addAuthorResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.AddAuthorResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/addAuthorRequest", output = "http://ws.jee.isima.com/BiblioService/addAuthorResponse")
    public int addAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editAuthor", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.EditAuthor")
    @ResponseWrapper(localName = "editAuthorResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.EditAuthorResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/editAuthorRequest", output = "http://ws.jee.isima.com/BiblioService/editAuthorResponse")
    public boolean editAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteAuthor", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.DeleteAuthor")
    @ResponseWrapper(localName = "deleteAuthorResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.DeleteAuthorResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/deleteAuthorRequest", output = "http://ws.jee.isima.com/BiblioService/deleteAuthorResponse")
    public boolean deleteAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.isima.jee.ws.Author
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAuthor", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.GetAuthor")
    @ResponseWrapper(localName = "getAuthorResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.GetAuthorResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/getAuthorRequest", output = "http://ws.jee.isima.com/BiblioService/getAuthorResponse")
    public Author getAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.isima.jee.ws.Author>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAuthor", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.FindAuthor")
    @ResponseWrapper(localName = "findAuthorResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.FindAuthorResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/findAuthorRequest", output = "http://ws.jee.isima.com/BiblioService/findAuthorResponse")
    public List<Author> findAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<com.isima.jee.ws.Author>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "allAuthors", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.AllAuthors")
    @ResponseWrapper(localName = "allAuthorsResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.AllAuthorsResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/allAuthorsRequest", output = "http://ws.jee.isima.com/BiblioService/allAuthorsResponse")
    public List<Author> allAuthors();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.isima.jee.ws.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBooksByAuthor", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.GetBooksByAuthor")
    @ResponseWrapper(localName = "getBooksByAuthorResponse", targetNamespace = "http://ws.jee.isima.com/", className = "com.isima.jee.ws.GetBooksByAuthorResponse")
    @Action(input = "http://ws.jee.isima.com/BiblioService/getBooksByAuthorRequest", output = "http://ws.jee.isima.com/BiblioService/getBooksByAuthorResponse")
    public List<Book> getBooksByAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
