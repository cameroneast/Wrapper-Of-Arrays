import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello. How many tickets would you like to be available for purchase?");
    Scanner scnr = new Scanner(System.in);
    MyArrayList tickets = new MyArrayList(scnr.nextInt());

    //Test the size method
    System.out.println("You want " + tickets.size() + " tickets.");

    //Test the get and set item methods.
    System.out.println("Select ticket number: ");
    int ticketNum = scnr.nextInt();
    
    System.out.println("Enter value for the ticket number: ");
    int ticketVal = scnr.nextInt();

    tickets.setItem(ticketNum - 1, ticketVal);

    System.out.println("Ticket number " + ticketNum + " has a value of " + tickets.getItem(ticketNum - 1));

    

    scnr.close();
  }
}