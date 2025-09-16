public class Book {
    String title;
    String author;
    int pages;
    String genre;

    void authorAndTitle() {
        System.out.println("Author is : " + author + " and title is : " + title);
    }
    void readtime () {
        Double readtime = pages / 17.5;
        System.out.println("Det tar ungefär " + readtime + " dagar att läsa boken, om du läser 17.5 sidor per dag");
    }
    boolean isgenre(String g) {
        return genre.equalsIgnoreCase(g);
    }
}



// Lägg till ett nytt fält i klassen Book som representerar bokens genre.
// Skapa en metod som kontrollerar om en bok tillhör en viss genre och returnerar true eller false.
// Testa metoden genom att kontrollera genren för olika bokobjekt.
