
package com.isima.jee.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isima.jee.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddAuthorResponse_QNAME = new QName("http://ws.jee.isima.com/", "addAuthorResponse");
    private final static QName _EditAuthor_QNAME = new QName("http://ws.jee.isima.com/", "editAuthor");
    private final static QName _GetAuthorOfBook_QNAME = new QName("http://ws.jee.isima.com/", "getAuthorOfBook");
    private final static QName _EditAuthorResponse_QNAME = new QName("http://ws.jee.isima.com/", "editAuthorResponse");
    private final static QName _AllAuthors_QNAME = new QName("http://ws.jee.isima.com/", "allAuthors");
    private final static QName _FindAuthor_QNAME = new QName("http://ws.jee.isima.com/", "findAuthor");
    private final static QName _GetAuthorResponse_QNAME = new QName("http://ws.jee.isima.com/", "getAuthorResponse");
    private final static QName _AllBooksResponse_QNAME = new QName("http://ws.jee.isima.com/", "allBooksResponse");
    private final static QName _DeleteAuthor_QNAME = new QName("http://ws.jee.isima.com/", "deleteAuthor");
    private final static QName _GetBookResponse_QNAME = new QName("http://ws.jee.isima.com/", "getBookResponse");
    private final static QName _GetBooksByAuthorResponse_QNAME = new QName("http://ws.jee.isima.com/", "getBooksByAuthorResponse");
    private final static QName _FindBook_QNAME = new QName("http://ws.jee.isima.com/", "findBook");
    private final static QName _GetAuthor_QNAME = new QName("http://ws.jee.isima.com/", "getAuthor");
    private final static QName _DeleteBook_QNAME = new QName("http://ws.jee.isima.com/", "deleteBook");
    private final static QName _AllBooks_QNAME = new QName("http://ws.jee.isima.com/", "allBooks");
    private final static QName _AddAuthor_QNAME = new QName("http://ws.jee.isima.com/", "addAuthor");
    private final static QName _GetAuthorOfBookResponse_QNAME = new QName("http://ws.jee.isima.com/", "getAuthorOfBookResponse");
    private final static QName _EditBook_QNAME = new QName("http://ws.jee.isima.com/", "editBook");
    private final static QName _GetBook_QNAME = new QName("http://ws.jee.isima.com/", "getBook");
    private final static QName _AddBookResponse_QNAME = new QName("http://ws.jee.isima.com/", "addBookResponse");
    private final static QName _FindBookResponse_QNAME = new QName("http://ws.jee.isima.com/", "findBookResponse");
    private final static QName _EditBookResponse_QNAME = new QName("http://ws.jee.isima.com/", "editBookResponse");
    private final static QName _AddBook_QNAME = new QName("http://ws.jee.isima.com/", "addBook");
    private final static QName _DeleteAuthorResponse_QNAME = new QName("http://ws.jee.isima.com/", "deleteAuthorResponse");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://ws.jee.isima.com/", "deleteBookResponse");
    private final static QName _AllAuthorsResponse_QNAME = new QName("http://ws.jee.isima.com/", "allAuthorsResponse");
    private final static QName _FindAuthorResponse_QNAME = new QName("http://ws.jee.isima.com/", "findAuthorResponse");
    private final static QName _GetBooksByAuthor_QNAME = new QName("http://ws.jee.isima.com/", "getBooksByAuthor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isima.jee.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditAuthor }
     * 
     */
    public EditAuthor createEditAuthor() {
        return new EditAuthor();
    }

    /**
     * Create an instance of {@link EditAuthorResponse }
     * 
     */
    public EditAuthorResponse createEditAuthorResponse() {
        return new EditAuthorResponse();
    }

    /**
     * Create an instance of {@link GetAuthorOfBook }
     * 
     */
    public GetAuthorOfBook createGetAuthorOfBook() {
        return new GetAuthorOfBook();
    }

    /**
     * Create an instance of {@link AddAuthorResponse }
     * 
     */
    public AddAuthorResponse createAddAuthorResponse() {
        return new AddAuthorResponse();
    }

    /**
     * Create an instance of {@link AllAuthors }
     * 
     */
    public AllAuthors createAllAuthors() {
        return new AllAuthors();
    }

    /**
     * Create an instance of {@link FindAuthor }
     * 
     */
    public FindAuthor createFindAuthor() {
        return new FindAuthor();
    }

    /**
     * Create an instance of {@link AllBooksResponse }
     * 
     */
    public AllBooksResponse createAllBooksResponse() {
        return new AllBooksResponse();
    }

    /**
     * Create an instance of {@link GetAuthorResponse }
     * 
     */
    public GetAuthorResponse createGetAuthorResponse() {
        return new GetAuthorResponse();
    }

    /**
     * Create an instance of {@link GetBooksByAuthorResponse }
     * 
     */
    public GetBooksByAuthorResponse createGetBooksByAuthorResponse() {
        return new GetBooksByAuthorResponse();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link DeleteAuthor }
     * 
     */
    public DeleteAuthor createDeleteAuthor() {
        return new DeleteAuthor();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link AllBooks }
     * 
     */
    public AllBooks createAllBooks() {
        return new AllBooks();
    }

    /**
     * Create an instance of {@link AddAuthor }
     * 
     */
    public AddAuthor createAddAuthor() {
        return new AddAuthor();
    }

    /**
     * Create an instance of {@link EditBook }
     * 
     */
    public EditBook createEditBook() {
        return new EditBook();
    }

    /**
     * Create an instance of {@link GetAuthorOfBookResponse }
     * 
     */
    public GetAuthorOfBookResponse createGetAuthorOfBookResponse() {
        return new GetAuthorOfBookResponse();
    }

    /**
     * Create an instance of {@link FindBook }
     * 
     */
    public FindBook createFindBook() {
        return new FindBook();
    }

    /**
     * Create an instance of {@link GetAuthor }
     * 
     */
    public GetAuthor createGetAuthor() {
        return new GetAuthor();
    }

    /**
     * Create an instance of {@link EditBookResponse }
     * 
     */
    public EditBookResponse createEditBookResponse() {
        return new EditBookResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link FindBookResponse }
     * 
     */
    public FindBookResponse createFindBookResponse() {
        return new FindBookResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link FindAuthorResponse }
     * 
     */
    public FindAuthorResponse createFindAuthorResponse() {
        return new FindAuthorResponse();
    }

    /**
     * Create an instance of {@link GetBooksByAuthor }
     * 
     */
    public GetBooksByAuthor createGetBooksByAuthor() {
        return new GetBooksByAuthor();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link DeleteAuthorResponse }
     * 
     */
    public DeleteAuthorResponse createDeleteAuthorResponse() {
        return new DeleteAuthorResponse();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link AllAuthorsResponse }
     * 
     */
    public AllAuthorsResponse createAllAuthorsResponse() {
        return new AllAuthorsResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "addAuthorResponse")
    public JAXBElement<AddAuthorResponse> createAddAuthorResponse(AddAuthorResponse value) {
        return new JAXBElement<AddAuthorResponse>(_AddAuthorResponse_QNAME, AddAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "editAuthor")
    public JAXBElement<EditAuthor> createEditAuthor(EditAuthor value) {
        return new JAXBElement<EditAuthor>(_EditAuthor_QNAME, EditAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "getAuthorOfBook")
    public JAXBElement<GetAuthorOfBook> createGetAuthorOfBook(GetAuthorOfBook value) {
        return new JAXBElement<GetAuthorOfBook>(_GetAuthorOfBook_QNAME, GetAuthorOfBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "editAuthorResponse")
    public JAXBElement<EditAuthorResponse> createEditAuthorResponse(EditAuthorResponse value) {
        return new JAXBElement<EditAuthorResponse>(_EditAuthorResponse_QNAME, EditAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllAuthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "allAuthors")
    public JAXBElement<AllAuthors> createAllAuthors(AllAuthors value) {
        return new JAXBElement<AllAuthors>(_AllAuthors_QNAME, AllAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "findAuthor")
    public JAXBElement<FindAuthor> createFindAuthor(FindAuthor value) {
        return new JAXBElement<FindAuthor>(_FindAuthor_QNAME, FindAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "getAuthorResponse")
    public JAXBElement<GetAuthorResponse> createGetAuthorResponse(GetAuthorResponse value) {
        return new JAXBElement<GetAuthorResponse>(_GetAuthorResponse_QNAME, GetAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "allBooksResponse")
    public JAXBElement<AllBooksResponse> createAllBooksResponse(AllBooksResponse value) {
        return new JAXBElement<AllBooksResponse>(_AllBooksResponse_QNAME, AllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "deleteAuthor")
    public JAXBElement<DeleteAuthor> createDeleteAuthor(DeleteAuthor value) {
        return new JAXBElement<DeleteAuthor>(_DeleteAuthor_QNAME, DeleteAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "getBooksByAuthorResponse")
    public JAXBElement<GetBooksByAuthorResponse> createGetBooksByAuthorResponse(GetBooksByAuthorResponse value) {
        return new JAXBElement<GetBooksByAuthorResponse>(_GetBooksByAuthorResponse_QNAME, GetBooksByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "findBook")
    public JAXBElement<FindBook> createFindBook(FindBook value) {
        return new JAXBElement<FindBook>(_FindBook_QNAME, FindBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "getAuthor")
    public JAXBElement<GetAuthor> createGetAuthor(GetAuthor value) {
        return new JAXBElement<GetAuthor>(_GetAuthor_QNAME, GetAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<DeleteBook>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "allBooks")
    public JAXBElement<AllBooks> createAllBooks(AllBooks value) {
        return new JAXBElement<AllBooks>(_AllBooks_QNAME, AllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "addAuthor")
    public JAXBElement<AddAuthor> createAddAuthor(AddAuthor value) {
        return new JAXBElement<AddAuthor>(_AddAuthor_QNAME, AddAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorOfBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "getAuthorOfBookResponse")
    public JAXBElement<GetAuthorOfBookResponse> createGetAuthorOfBookResponse(GetAuthorOfBookResponse value) {
        return new JAXBElement<GetAuthorOfBookResponse>(_GetAuthorOfBookResponse_QNAME, GetAuthorOfBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "editBook")
    public JAXBElement<EditBook> createEditBook(EditBook value) {
        return new JAXBElement<EditBook>(_EditBook_QNAME, EditBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "findBookResponse")
    public JAXBElement<FindBookResponse> createFindBookResponse(FindBookResponse value) {
        return new JAXBElement<FindBookResponse>(_FindBookResponse_QNAME, FindBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "editBookResponse")
    public JAXBElement<EditBookResponse> createEditBookResponse(EditBookResponse value) {
        return new JAXBElement<EditBookResponse>(_EditBookResponse_QNAME, EditBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "deleteAuthorResponse")
    public JAXBElement<DeleteAuthorResponse> createDeleteAuthorResponse(DeleteAuthorResponse value) {
        return new JAXBElement<DeleteAuthorResponse>(_DeleteAuthorResponse_QNAME, DeleteAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<DeleteBookResponse>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllAuthorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "allAuthorsResponse")
    public JAXBElement<AllAuthorsResponse> createAllAuthorsResponse(AllAuthorsResponse value) {
        return new JAXBElement<AllAuthorsResponse>(_AllAuthorsResponse_QNAME, AllAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "findAuthorResponse")
    public JAXBElement<FindAuthorResponse> createFindAuthorResponse(FindAuthorResponse value) {
        return new JAXBElement<FindAuthorResponse>(_FindAuthorResponse_QNAME, FindAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.isima.com/", name = "getBooksByAuthor")
    public JAXBElement<GetBooksByAuthor> createGetBooksByAuthor(GetBooksByAuthor value) {
        return new JAXBElement<GetBooksByAuthor>(_GetBooksByAuthor_QNAME, GetBooksByAuthor.class, null, value);
    }

}
