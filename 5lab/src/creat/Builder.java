package creat;

public class Builder {
    public static void main(String[] args) {
        Book_1 book = new Book_1.Builder("Евгений Онегин", "A.S.Pushkin")
                .setCost(550.1)
                .setDescription("Роман начинается с сетований молодого дворянина Евгения Онегина по поводу болезни своего дядюшки, вынудившего Евгения покинуть Петербург и отправиться к больному, чтобы проститься с ним. Обозначив таким образом завязку, автор занимает первую главу рассказом о происхождении, семье и жизни своего героя до получения известия о болезни родственника.")
                .build();

        book.printInfo();
    }


}

class Book_1  {
    private String title;
    private String author;
    private String description;
    private double cost;

    public String getTitle() {
        return this.title;
    }

    public double getCost() {
        return this.cost;
    }

    public String getDescription() {
        return this.description;
    }

    public String getAuthor() {
        return this.author;
    }

    public void printInfo() {
        System.out.println("BOOK INFO\nTITLE: " + this.getTitle() +
                " - AUTHOR: " + this.getAuthor() +"\nDESCRIPTION: " + this.description +"\nCOST: " + this.getCost());
    }

    private Book_1(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.description = builder.description;
        this.cost = builder.cost;
    }

    static class Builder {
        private String title;
        private String author;
        private String description;
        private double cost;

        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public Book_1 build() {
            return new Book_1(this);
        }
    }
}
