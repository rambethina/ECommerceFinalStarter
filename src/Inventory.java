import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    List<Book> bookList;

    public Inventory() {
        bookList = new ArrayList<>();
    }

    public void sampleInitializeInventory() {
        bookList.add(
                new Book("ISBN001", "How to program in cPlusPlus", "John Doe", BookCategory.EDUCATIONAL, 12.3)
        );
        bookList.add(
                new Book("ISBN002", "How to program in Java", "John Doe", BookCategory.EDUCATIONAL, 12.3)
        );
    }

    public void initializeInventory() {
        // PROVIDE IMPLEMENTATION
        // READ FROM FILE
        // FOR EACH LINE THAT YOU READ FROM FILE
        // CALL BOOK CONSTRUCTOR THAT TAKES A STRING, IF YOU NOTICE IT WILL SPLIT THE STRING AND INITIALIZE DETAILS OF THE BOOK.
        // refer to https://rambethina.github.io/java/mydoc_week_nine.html#working-with-files
        // for simplicity, I would recommend providing the full path to the input file

        // Look at SampleInput.txt for sample file


    }

    public Book searchBook(String isbnNumberInput) {

        //PROVIDE IMPLEMENTATION

        /*
         Iterate over list of books
         get each book in bookList, get its isnbNumber by calling getIsnbNumber method and check if its equal to isbnNumberInput
         if found return Book found
         else return null

         A sample of how to iterate can be found in showAllBooks method in this class
         */
        return null;
    }

    public void showAllBooks() {
        Iterator<Book> iterator = bookList.iterator();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.toString());
        }
    }
}
