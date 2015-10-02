package howdryiam;

import java.util.Scanner;

/**
 * 
 * @author Seth Frosch
 */

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
        
        //Creating first address instance for address information
        Address address1 = createAddress(keyboard);
        
        //Creating first dimension instance to create box
        Dimensions dim1 = buildBox(keyboard);
        
        //Creating second address instance for address information
        Address address2 = createAddress(keyboard);
        
        //Creating second dimension instance to create box
        Dimensions dim2 = buildBox(keyboard);
	
        //Creating label instances to hold address and dimension data
	LabelPrinter label1 = new LabelPrinter(address1, dim1);
        LabelPrinter label2 = new LabelPrinter(address2, dim2);
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  
  /**
   * Method to accept and store address information
   * @param createAddress Takes input from Scanner to store in Address instance
   * @return An instance of the Address class
   */
  public static Address createAddress(Scanner keyboard){
      	println("Constructing Address");
	println("Name:");
	String name = keyboard.nextLine();
	println("Street:");
	String street = keyboard.nextLine();
	println("City:");
	String city = keyboard.nextLine();
	println("State:");
	String state = keyboard.next();
	println("ZipCode:");
	int zip = keyboard.nextInt();
        keyboard.nextLine();
	
	Address address = new Address(name, street, city, state, zip);
        return address;
  }
  
  /**
   * Method to accept and store box dimensions
   * @param buildBox Takes input from Scanner to store in Dimensions instance
   * @return An instance of the Dimensions class
   */
  public static Dimensions buildBox(Scanner keyboard){
        println("Constructing Box");
	println("Depth:");
	double depth = keyboard.nextDouble();
	println("Width:");
	double width = keyboard.nextDouble();
	println("Height:");
	double height = keyboard.nextDouble();
        keyboard.nextLine();
	
	Dimensions dim = new Dimensions(depth, width, height);
        return dim;
  }
  
  /**
   * Method to output string messages
   * @param println Outputs a string message
   */
  public static void println(String message){
	System.out.println(message);
  }
}
