public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("The books title is " + title + ", the author is " + author + " and the price is $" + price + "!");
    }


}
