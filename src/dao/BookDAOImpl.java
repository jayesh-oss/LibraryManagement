package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import util.DBConnection;

public class BookDAOImpl implements BookDAO {

    Connection con = DBConnection.getConnection();

    // Add Book
    @Override
    public void addBook(Book book) {

        try {

            String sql = "INSERT INTO books(title, author, price) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());

            ps.executeUpdate();

            System.out.println("Book Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // View All Books
    @Override
    public List<Book> getAllBooks() {

        List<Book> list = new ArrayList<>();

        try {

            String sql = "SELECT * FROM books";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Book book = new Book();

                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getDouble("price"));

                list.add(book);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Update Book
    @Override
    public void updateBook(Book book) {

        try {

            String sql = "UPDATE books SET title=?, author=?, price=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());
            ps.setInt(4, book.getId());

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Book Updated Successfully!");
            else
                System.out.println("Book ID Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete Book
    @Override
    public void deleteBook(int id) {

        try {

            String sql = "DELETE FROM books WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Book Deleted Successfully!");
            else
                System.out.println("Book ID Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}