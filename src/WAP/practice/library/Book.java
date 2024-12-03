package WAP.practice.library;

public class Book {

    String bookName;
    String author;
    int publishedYear;

    public Book(String bookName, String author, int publishedYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
    }

        public void libraryDetails(){
            System.out.println("Name of the book: " + bookName);
            System.out.println("Name of the author: " + author);
            System.out.println("Published year: " + publishedYear);

        }

}
