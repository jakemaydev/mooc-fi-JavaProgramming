public class Book {
    private String title;
    private int pages;
    private int releaseYear;

    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.releaseYear = year;
    }

    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public int getYear() {
        return releaseYear;
    }

    public String toStringTitle(){
        return title;
    }

    public String toStringEverything(){
        return title + ", " + pages + " pages, " + releaseYear;
    }
}
