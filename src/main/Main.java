package main;

import java.util.List;
import java.util.Scanner;

import dao.BookDAO;
import dao.BookDAOImpl;
import model.Book;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookDAO dao = new BookDAOImpl();

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

            case 1:

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                Book book = new Book(title, author, price);

                dao.addBook(book);

                break;

            case 2:

                List<Book> books = dao.getAllBooks();

                System.out.println("\n------------------------------------------------");
                System.out.printf("%-5s %-25s %-20s %-10s%n", "ID", "Title", "Author", "Price");
                System.out.println("------------------------------------------------");

                for (Book b : books) {
                    System.out.printf("%-5d %-25s %-20s %-10.2f%n",
                            b.getId(),
                            b.getTitle(),
                            b.getAuthor(),
                            b.getPrice());
                }

                break;

            case 3:

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Title: ");
                String newTitle = sc.nextLine();

                System.out.print("Enter New Author: ");
                String newAuthor = sc.nextLine();

                System.out.print("Enter New Price: ");
                double newPrice = sc.nextDouble();

                Book updateBook = new Book(id, newTitle, newAuthor, newPrice);

                dao.updateBook(updateBook);

                break;

            case 4:

                System.out.print("Enter Book ID to Delete: ");
                int deleteId = sc.nextInt();

                dao.deleteBook(deleteId);

                break;

            case 5:

                System.out.println("Thank You!");

                break;

            default:

                System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}