package struc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


interface Book {
    void printInfo();
    void setTitle(String title);
    void setCost(Double cost);
    String getTitle();
    Double getCost();
}

class SimpleBook implements Book {
    private String title;
    private Double cost = 0.0;

    public SimpleBook(String title,  Double cost) {
        this.title = title;
        this.cost = cost;
    }

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
    public Double getCost() {
        return this.cost;
    }
}

class Magazine extends SimpleBook {
    public Magazine(String title,  Double cost) {
        super(title, cost);
    }

    @Override
    public void printInfo() {
        System.out.println("MAGAZINE: TITLE: " + this.getTitle() + " COST: " + this.getCost());
    }

}

class Newspaper extends SimpleBook {
    public Newspaper(String title, Double cost) {
        super(title, cost);
    }

    @Override
    public void printInfo() {
        System.out.println("NEWSPAPER: TITLE: " + this.getTitle() + " COST: " + this.getCost());
    }
}

class BooksStorage {
    private Book magazine;
    private Book newspaper;

    public BooksStorage(){
        magazine= new Magazine("VOGUE", 300.1);
        newspaper =new Newspaper("THE NEW YORK TIMES", 70.1);
    }

    public void magazineInfo(){
        magazine.printInfo();
    }
    public void newspaperInfo(){
        newspaper.printInfo();
    }
}

public class Facade {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("========= LIBRARY ============ \n");
            System.out.print("            1. MAGAZINE.              \n");
            System.out.print("            2. NEWSPAPER.              \n");
            System.out.print("            3. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            BooksStorage booksStorage = new BooksStorage();

            switch (choice) {
                case 1: booksStorage.magazineInfo(); break;
                case 2: booksStorage.newspaperInfo(); break;
                default: System.out.println("bye"); return;
            }
        } while (choice != 3);
    }
}
