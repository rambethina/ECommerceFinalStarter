import java.util.Scanner;

public class ECommerceMain {

    public static void main(String[] args) {

        System.out.println("** List of books in Inventory ** ");

        Inventory inventory = new Inventory();
        Cart cart = new Cart();

        //Sample
        inventory.sampleInitializeInventory();

        //Uncomment line below after you implement initializeInventory method
        //inventory.initializeInventory();

        inventory.showAllBooks();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ISBN Number of Book to add to cart");
        String isbnNumber = scanner.nextLine();

        Book searchedBook = inventory.searchBook(isbnNumber);

        if(searchedBook != null) {
            System.out.println("** Book found **");
            System.out.println(searchedBook);
            cart.add(searchedBook);
        } else {
            System.out.println("** Book not found **");
        }

        System.out.println("PART 1 - PRINTING CART DETAILS");
        cart.printCartDetails();

        System.out.println("PART 2 - PRINTING INVENTORY DETAILS, IF BOOK IS ALREADY SOLD BOOK SHOULD NOT DISPLAY IN INVENTORY");
    }
}
