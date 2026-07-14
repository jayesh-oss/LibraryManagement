package dao;

import java.util.List;
import model.Book;

public interface BookDAO {

    void addBook(Book book);

    List<Book> getAllBooks();

    void updateBook(Book book);

    void deleteBook(int id);

}