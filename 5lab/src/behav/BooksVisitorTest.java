package behav;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BooksVisitorTest {
    Visitor visitor = new BooksVisitor();

    @Test
    void calculateMagazineCost() {
        double price = 851.11;
        assertEquals(0.5 * Math.sqrt(price), visitor.calculateMagazineCost(price));
    }

    @Test
    void calculateNewspaperCost() {
        double price = 851.11;
        assertEquals(Math.sqrt(Math.cos(price) * 14), visitor.calculateNewspaperCost(price));
    }

}