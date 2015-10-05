package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * main   Create an address label by prompting the user for data
   *        Also creates a box by prompting the user for its dimensions
   *        And lastly, prints the address data and the box dimensions
   * @param args No arguments
   */
  public static void main(String[] args) {
        // create Scanner object for keyboard input
	Scanner keyboard = new Scanner(System.in);
	
        // prepare first box
        Address address1 = buildAddress(keyboard);  // enter address
        Dimensions dim1 = buildBox(keyboard);       // enter box dimensions
	LabelPrinter label1 = new LabelPrinter(address1, dim1);  // create label
	
        // prepare second box
        Address address2 = buildAddress(keyboard);  // enter address 
        Dimensions dim2 = buildBox(keyboard);       // enter box dimensions        
	LabelPrinter label2 = new LabelPrinter(address2, dim2);  // create label
	
	//Printing Labels
        println("\nPrint labels:");
        println("================================");
	label1.printLabel();
	label2.printLabel();
        println("\n\n\nThe End!!");
  } // main
  
  /**
   * print  prints the message without a newline at the end
   * @param message the string to be printed
   */
  public static void print(String message){
        // print message without a newline
	System.out.print(message);
  }
  
  /**
   * println  prints the message with a newline at the end
   * @param message the string to be printed
   */
  public static void println(String message){
        // print message with newline at the end
	System.out.println(message);
  }
  
  /**
   * Address    builds an Address object by prompting the user for 
   *            their name and address
   * @param keyboard    Scanner object for user input
   * @return    Address object with name, address, city, state, zip
   */
  public static Address buildAddress(Scanner keyboard){
        // prompt user for name and address
        println("\nConstructing Address");
        print("Attn: ");
        String name = keyboard.nextLine();
	print("Street: ");
	String street = keyboard.nextLine();
	print("City: ");
	String city = keyboard.nextLine();
	print("State: ");
	String state = keyboard.nextLine();
	print("ZipCode: ");
	int zip = keyboard.nextInt();
        keyboard.nextLine();                    // consume extra newline
        
        // create Address object
        Address addy = new Address(name, street, city, state, zip);
        return addy;
  } // buildAddress
  
  /**
   * Dimensions   builds a Dimension object by prompting the user for 
   *              the 3 dimensions of a box
   * @param keyboard    Scanner object for user input
   * @return      Dimension object with height, width, depth
   */
  
  public static Dimensions buildBox(Scanner keyboard) {
        // prompt user for box dimensions
        println("\nConstructing Box");
	print("Height: ");
	Double height = keyboard.nextDouble();
	print("Width: ");
	Double width = keyboard.nextDouble();
	print("Depth: ");
	Double depth = keyboard.nextDouble();
	keyboard.nextLine();                    // consume extra newline
        
        // create Dimension object
        Dimensions dim = new Dimensions(width, height, depth);
        return dim;
  } // buildBox
  
} // class
