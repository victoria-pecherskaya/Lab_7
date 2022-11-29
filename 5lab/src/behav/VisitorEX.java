package behav;

import java.sql.SQLOutput;

public class VisitorEX {

    public static void main(String[] args) {
        Book magazine = new Magazine();
        magazine.print(new BooksVisitor());

        Book newspaper = new Newspaper();
        newspaper.print(new BooksVisitor());
    }
}

interface Book {
    void print(Visitor visitor);
    void calculateCost(Visitor visitor, double price);
}

class Magazine implements Book {

    @Override
    public void print(Visitor visitor) {
        visitor.printMagazine();
    }

    @Override
    public void calculateCost(Visitor visitor, double price) {
        visitor.calculateMagazineCost(price);
    }
}

class Newspaper implements Book {

    @Override
    public void print(Visitor visitor) {
        visitor.printNewspaper();
    }

    @Override
    public void calculateCost(Visitor visitor, double price) {
        visitor.calculateNewspaperCost(price);
    }
}

interface Visitor {
    void printMagazine();
    double calculateMagazineCost(double price);

    void printNewspaper();
    double calculateNewspaperCost(double price);
}

class BooksVisitor implements Visitor {

    @Override
    public void printMagazine() {
        System.out.println("Magazine Visitor");
    }

    @Override
    public double calculateMagazineCost(double price) {
        return 0.5 * Math.sqrt(price);
    }

    @Override
    public void printNewspaper() {
        System.out.println("Newspaper Visitor");
    }

    @Override
    public double calculateNewspaperCost(double price) {
        return Math.sqrt(Math.cos(price) * 14);
    }

}
