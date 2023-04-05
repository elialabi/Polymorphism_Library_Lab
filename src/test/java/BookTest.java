import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {

    Book book;

    @BeforeEach
    public void setup(){
        book = new Book("Bridge to Terabithia", 0.00,"Katherine Paterson", "Hardcover");

    }
    @Test
    public void testIsHardcover(){
        Book book = new Book("The Great Gasby", 0.0, "F.Scott Fitzgerald", "hardcover");
        assertTrue(book.isHardcover());
    }
    @Test
    public void testIsSoftcover(){
       Book book = new Book("Normal People", 0.0, "Sally Rooney", "softcover");
       assertTrue(book.isSoftCover());

    }
    @Test
    public void testGetAuthor(){
        Book book = new Book("Crying in H-Mart", 0.0,"Michelle Zauner","softcover");
        assertEquals("Michelle Zauner",book.getAuthor());
    }
}
