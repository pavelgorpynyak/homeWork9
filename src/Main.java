public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Voina i mir", 1869);
        Author book1AuthorName = new Author("Lev", "Tolstoy");
        System.out.println("book1.getBookName() = " + book1.getBookName());
        System.out.println("book1.getYearOfPublishing() = " + book1.getYearOfPublishing());
        System.out.println("book1Autorname.getAuthorName() = " + book1AuthorName.getAuthorName());
        System.out.println("book1Autorname.getAuthorSurname() = " + book1AuthorName.getAuthorSurname());

        book1.setYearOfPublishing(2001);
        System.out.println("book1.getYearOfPublishing() = " + book1.getYearOfPublishing());

        Book book2 = new Book("Igra prestolov", 2001);
        Author book2AuthorName = new Author("George", "Martin");

    }
}