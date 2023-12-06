import org.example.BookStore;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        BookStore BookStore=new BookStore();
        //BookStore.connectToBookStore("assignment2", "ayselaliyeva", "Aysel123");
        Connection conn=BookStore.connectToBookStore("assignment2", "ayselaliyeva", "Aysel123");

        //BookStore.createBook(conn, "5", "Harry Potter and the Sorcerer''s Stone", "1", "1984", "50", "1");
        //BookStore.readBooks(conn,"");
        //BookStore.updateBookStock(conn, "");
        //BookStore.deleteBook(conn, "");
        //BookStore.Order(conn, "");
        //System.out.println(BookStore.Check(conn, ""));
        //BookStore.OrderBook(conn, );
        //BookStore.OrderBook(conn, "");
    }
}

