# ECommerceFinalStarter

Initial setup
* Click on Code button (Green Button)
* Download Zip
* Uncompress zip
* Open IntelliJ, File -> Open and choose folder that you unzipped.
* You may need to set your SDK, You may be prompted for this.
* Right click on ECommerceMain and Run

PART 1 - BASIC IMPLEMENTATION - YOU WILL BE ABLE TO ADD ONE BOOK TO YOUR CART.
* Provide implementation for
  * Book(String lineFromFile)
  * Inventory
    * initializeInventory
    * searchBook
  * Cart
    * printCartDetails
    * add

Important - SUBMIT YOUR PROGRAM AFTER PART 1 IS IMPLEMENTED.

PART 2 - PRINTING INVENTORY DETAILS, IF BOOK IS ALREADY SOLD BOOK SHOULD NOT DISPLAY IN INVENTORY (Quantity can be 0 and you show SOLD OUT)
  * While there are many ways you can implement this, I would recommend using a HashMap data structure.
  * In your Inventory class instead of storing books in a list you can store them in a HashMap, In a map you normally store data as key value pairs. The key can be isbnNumber and value a book.
  * You will most probably need to change implement of methods in Inventory, But you will notice changes will be limited to Inventory class, which illustrates the concept of Encapsulation in OOP.
  * You may need to add a count instance variable to book class.
  * Your map will contain a list of unique books.

PART 3 - Change your program so that you can purchase more than one book.

PART 4 - (OPTIONAL) - Remove from cart.

PART 4 - (OPTIONAL) - Add a login module.
