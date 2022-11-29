package creat;

public class Factory {
    public static void main(String[] args) {
        BookFactory booksFactory = new BookFactory();
        Book vogueMagazine = booksFactory.create("Magazine");
        Book timesNespaper = booksFactory.create("Newspaper");

        vogueMagazine.setTitle("VOGUE");
        vogueMagazine.setCost(300.20);
        vogueMagazine.printInfo();

        timesNespaper.setTitle("THE NEW YORK TIMES");
        timesNespaper.setCost(70.23);
        timesNespaper.printInfo();
    }
};

interface BookInterface {
    void printInfo();
    void setTitle(String title);
    void setCost(Double cost);
    String getTitle();
    double getCost();
}

class Book implements BookInterface {
    private String title = "unknown";
    private double cost = 0.0;

    @Override
    public void printInfo() {
        System.out.println("Book " + this.title);
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

}

class Magazine extends Book {
    @Override
    public void printInfo() {
        System.out.println("MAGAZINE Info::\n Title: " + this.getTitle() + " cost: " + this.getCost());
    }

}

class Newspaper extends Book {
    @Override
    public void printInfo() {
        System.out.println("NEWSPAPER Info::\n Title: " + this.getTitle() + " cost: " + this.getCost());
    }
}

class BookFactory {
    public Book create(String typeOfBook) {
        switch (typeOfBook) {
            case "Newspaper": return new Newspaper();
            case "Magazine": return new Magazine();
            default: return null;
        }
    }
}

