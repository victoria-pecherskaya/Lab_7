package creat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FactoryTest {
    BookFactory booksFactory = new BookFactory();

    FactoryTest() {
    }

    @DisplayName("should return new instance of Newspaper")
    @Test
    void createNewspaper() {
        Book book = this.booksFactory.create("Newspaper");
        Assertions.assertTrue(book instanceof Newspaper);
    }

    @DisplayName("should return new instance of Magazine")
    @Test
    void createMagazine() {
        Book book = this.booksFactory.create("Magazine");
        Assertions.assertTrue(book instanceof Magazine);
    }

    @DisplayName("should return null with incorrect typeOf book")
    @Test
    void createIncorrect() {
        Book book = this.booksFactory.create("Nothing");
        Assertions.assertTrue(book == null);
    }
}

class BookTest {
    Book book = new Book();

    BookTest() {
    }

    @DisplayName("should set new title for a book")
    @Test
    void setTitle() {
        this.book.setTitle("New title");
        Assertions.assertEquals("New title", this.book.getTitle());
    }

    @DisplayName("should set new cost for a book")
    @Test
    void setCost() {
        this.book.setCost(Double.valueOf(200.0D));
        Assertions.assertEquals(200.0D, this.book.getCost());
    }

    @DisplayName("should has unknown title by default")
    @Test
    void getTitle() {
        Assertions.assertEquals("unknown", this.book.getTitle());
    }

    @DisplayName("should costs 0.0 by default")
    @Test
    void getCost() {
        Assertions.assertEquals(0.0D, this.book.getCost());
    }
}




