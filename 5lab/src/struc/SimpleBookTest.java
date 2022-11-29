package struc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;


class SimpleBookTest {
    String title = "Title";
    Double cost = 11.1;
    SimpleBook book = new SimpleBook(title, cost);

    @DisplayName("should return book title")
    @Test
    void getTitle() {
        assertEquals(title, book.getTitle());
    }

    @DisplayName("should return book cost")
    @Test
    void getCost() {
        assertEquals(cost, book.getCost());
    }

    @DisplayName("should set new title for a book")
    @Test
    void setTitle() {
        book.setTitle("new title");
        assertEquals("new title", book.getTitle());
    }

    @DisplayName("should set new cost for a book")
    @Test
    void setCost() {
        book.setCost(185.2);
        assertEquals((Double)185.2, book.getCost());
    }
}