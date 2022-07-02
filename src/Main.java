public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Voina i mir", 1869,new Author("Lev", "Tolstoy"));

        System.out.println(book1.getBookName() + " " + book1.getYearOfPublishing() + " " + book1.getAuthorName());

        book1.setYearOfPublishing(2001);
        System.out.println("book1.getYearOfPublishing() = " + book1.getYearOfPublishing());

        Book book2 = new Book("Igra prestolov", 2001, new Author("George", "Martin"));

    }
}