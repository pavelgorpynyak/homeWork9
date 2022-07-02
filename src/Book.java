public class Book {

    private String bookName;
    private int yearOfPublishing;
    private final Author author;


    public Book (String bookName, int yearOfPublishing, Author author) {
        this.bookName = bookName;
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public Author getAuthorName(){return this.author;}

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

}
