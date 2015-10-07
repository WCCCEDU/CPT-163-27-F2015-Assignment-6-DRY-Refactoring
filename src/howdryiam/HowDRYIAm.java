package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);	
	
	// Preparing First Box
	Address address1 = buildAddress(keyboard);
        Dimensions dim1 = buildDimension(keyboard);		
	LabelPrinter label1 = new LabelPrinter(address1, dim1);
	
	// Preparing Second Box
	Address address2 = buildAddress(keyboard);
	Dimensions dim2 = buildDimension(keyboard);	
	LabelPrinter label2 = new LabelPrinter(address2, dim2);
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  
  /**
   * Constructs a Address instance from user input
   * @param keyboard - A Scanner object to provide values for the generation of
   * Address
   * @return Address instance constructed with user input
   */
  public static Address buildAddress(Scanner keyboard) {  
      println("Constructing Address");
	println("Attn:");
	String name = keyboard.next();
	println("Street:");
	String street = keyboard.next();
	println("City:");
	String city = keyboard.next();
	println("State:");
	String state = keyboard.next();
	println("ZipCode:");
	int zip = keyboard.nextInt();
      
      Address addr = new Address(name, street, city, state, zip);
      return addr;
  }
  
  /**
   * Constructs a Dimensions instance from user input
   * @param keyboard - A Scanner object to provide values for the generation of
   * Dimensions
   * @return  Dimensions instance constructed with user input
   */
  public static Dimensions buildDimension(Scanner keyboard) {
      
      println("Constructing Box");
	println("Height:");
	double height = keyboard.nextDouble();
	println("Width:");
	double width = keyboard.nextDouble();
	println("Depth:");
	double depth = keyboard.nextDouble();
      
      Dimensions dim = new Dimensions(width, height, depth);
      return dim;
  }
  
  public static void println(String message){
	System.out.println(message);
  }
}
