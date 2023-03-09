package j22_Encapsulation.encapsulation01.task05;

public class Book {
    private String bookName;
    private String bookAuthorName;

    public Book(String bookName, String bookAuthorName) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }


    @Override
    public String toString() {
        return
                bookName + " is/ was written by " + bookAuthorName;
    }
}

class  BookRunner{
    public static void main(String[] args) {
        Book book1= new Book("Lord of the Rings", " J.R.R Tolkien");
        System.out.println(book1);

    }
}
/*
* task->
    Book class'ında valuelari girilen bookName ve authorName (String ) İ
    ki tane attributes oluşturunuz.
    Book class'ını datahiding yapınız. (Encapsulate)
    Main class'ın içine object  create edip print eden code create ediniz.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
 */
