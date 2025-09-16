//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.title = "McDonalds handbok";
        myBook.author = "Ronald McDonald";
        myBook.pages = 254;
        myBook.genre = "McDonalds";
        myBook.authorAndTitle();
        myBook.readtime();

        Book myBook2 = new Book();
        myBook2.title = "Max handbok";
        myBook2.author = "Curt Bergfors";
        myBook2.pages = 283;
        myBook2.genre = "Max";
        myBook2.authorAndTitle();
        myBook2.readtime();

        Book myBook3 = new Book();
        myBook3.title = "Subway handbok";
        myBook3.author = "Peter Buck";
        myBook3.pages = 196;
        myBook3.genre = "Subway";
        myBook3.authorAndTitle();
        myBook3.readtime();

        System.out.println(myBook.title + " är Mcdonalds-bok? " + myBook.isgenre("Mcdonalds"));
        System.out.println(myBook2.title + " är McDonalds-bok? " + myBook2.isgenre("McDonalds"));
        System.out.println(myBook3.title + " är Subway-bok? " + myBook3.isgenre("subway"));

        if (myBook.pages > myBook2.pages) {
            System.out.println("Boken med mest sidor är " + myBook.title + ", den har mer än " + myBook2.title);
        } else if (myBook.pages < myBook2.pages) {
            System.out.println("Boken med mest sidor är " + myBook2.title + ", den har mer än " + myBook.title);
        } else {
            System.out.println("Böckerna har lika många sidor");
        }
    }
}


