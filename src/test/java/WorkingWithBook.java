import model.Book;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class WorkingWithBook {
    @Test
    public void creatingAndUsingBook() {
       Book book = new Book();
       book.setBookAuthor("A. Grin");
       book.setNameBook("Alye Parusa");
       book.setBookCover("Tverdyj");
       book.setCirculation(100);
       book.setFormat("Povestj");
       book.setLetterSize(5);
       book.setPaper(50);

        Book book2 = new Book();
        book2.setBookAuthor("Rouling Dz. K.");
        book2.setNameBook("Harry Potter");
        book2.setBookCover("Myahkij");
        book2.setCirculation(200);
        book2.setFormat("Roman");
        book2.setLetterSize(6);
        book2.setPaper(100);

    book2.printFullBook();
    }
}
