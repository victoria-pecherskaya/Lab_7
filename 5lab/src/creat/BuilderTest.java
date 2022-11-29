package creat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BuilderTest {
    Book_1 book;

    @DisplayName("Builder should return new Book_1 instance")
    @Test
    void create() {
        book = new Book_1.Builder("Title", "Author").build();
        assertTrue(book instanceof Book_1);
    }

    @DisplayName("should get a proper info for a book")
    @Test
    void getTitle() {
        book = new Book_1.Builder("Title", "Author").setCost(1.0).setDescription("desc").build();
        assertAll("properties",
                () -> assertEquals("Title", book.getTitle()),
                () -> assertEquals("Author", book.getAuthor()),
                () -> assertEquals(1.0, book.getCost()),
                () -> assertEquals("desc", book.getDescription())
        );
    }

}