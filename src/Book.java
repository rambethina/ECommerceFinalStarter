public class Book {

    String isbnNumber;
    String title;
    String author;
    BookCategory bookCategory;
    double price;

    public Book(String isbnNumber, String title, String author, BookCategory bookCategory, double price) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.author = author;
        this.bookCategory = bookCategory;
        this.price = price;
    }

    public Book(String lineFromFile) {
        //PROVIDE IMPLEMENTATION

        // YOU CAN ASSUME THE FOLLOWING FORMAT SEPERATE BY COMMAS
        //ISBN NUMBER, TITLE, PRICE, BOOK CATEGORY, AUTHOR
        // AND BELOW IS AN EXAMPLE
        // ISBN001, How to program in cPlusPlus, 19.2, Educational, John Doe

        /*
        HINT - look at String API methods. There should be a method to split method
        public String[] split(String regex)

        split method will return an array of strings.
        Sample
        String[] values = lineFromFile.split(",");
         this.isbnNumber = values[0];
         ...
         ...

         */
        String[] values = lineFromFile.split(",");
        this.isbnNumber = values[0];

    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNumber='" + isbnNumber + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookCategory=" + bookCategory +
                ", price=" + price +
                '}';
    }
}
