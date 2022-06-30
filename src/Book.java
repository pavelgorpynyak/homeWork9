public class Book {


    String bookName;

    int yearOfPublishing;

    public Book (String bookName, int yearOfPublishing) {
        Author author = new Author("1", "1");
        this.bookName = bookName;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

}
