public class LibraryBook {
    private String title;
    private String author;
    private int yearPublished;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    protected void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYearPublished(){
        return this.yearPublished;
    }
}

class EBook extends LibraryBook {
    public void setPublicationyear(int year){
        setYearPublished(year);
    }
}