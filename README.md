# VendingMachineCapstone
Developed a command line vending machine application using File I/O and OOP principles. Includes delimited input file processing, log functionality, inventory and credit system.  Completed bonus option that generated sales report written to a text file uniquely named with SimpleDateFormat.

I used an abstract class to act as a template for the 4 kinds of vending machine items. The items are instantiated with a method that takes a pipe delimited text file and reads it with the Scanner class.

User can:

List all products with their quantity.

Add money into the machine to purchase items.

See their current balance continually while purchasing items.

Purchase items until they are sold out.

Receive their change in the smallest amount of coins.

The program also:

Logs each time the user adds money, buys an item, or requests change timestamped with SimpleDateFormat class.

This logger creates a log.txt file with PrintWriter class that gets overridden each time the program runs.

Can generate a sales report that shows what items were purchased, how many, and the amount of total purchases.

This sales report is uniquely named with SimpleDateFormat and persists eveb after program is started again.
