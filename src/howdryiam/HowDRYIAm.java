package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	// Dimensions Prep
	Dimensions dim1;
	Dimensions dim2;
	
	// address Prep
	Address address1;
	Address address2;
		
	
	LabelPrinter label1;
	LabelPrinter label2;
	
	// Preparing First Box
	
        println("Constructing Address one");
	address1 = constructAddress(keyboard);
	
	println("Constructing Box one");
	dim1 = constructDimensions(keyboard);
	
	label1 = new LabelPrinter(address1, dim1);
	
	// Preparing Second Box
	
        println("Constructing Address two");
	address2 = constructAddress(keyboard);
	
	println("Constructing Box two");
	dim2 = constructDimensions(keyboard);
	
	label2 = new LabelPrinter(address2, dim2);
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  
  
  public static void println(String message){
	System.out.println(message);
  }
  
  /**
   * Constructs an Address instance from user input
   * @param keyboard - A Scanner object to provide values for the creation
   * of an Address
   * @return Address instance created from user input
   */
  public static Address constructAddress(Scanner keyboard){
      	String name;
	String street;
	String state;
	String city;
	int zip;
        
	println("Attn:");
	name = keyboard.next();
	println("Street:");
	street = keyboard.next();
	println("City:");
	city = keyboard.next();
	println("State:");
	state = keyboard.next();
	println("ZipCode:");
	zip = keyboard.nextInt();
        
        return new Address(name, street, city, state, zip);
        
  }
  
   /**
   * Constructs a Dimensions instance from user input
   * @param keyboard - A Scanner object to provide values for the creation
   * of a set of Dimensions
   * @return Dimensions instance created from user input
   */
  public static Dimensions constructDimensions(Scanner keyboard){
      	double width;
	double depth;
	double height;
        
      	println("Height:");
	height = keyboard.nextDouble();
	println("Width:");
	width = keyboard.nextDouble();
	println("Depth:");
	depth = keyboard.nextDouble();
        
        return new Dimensions(width, height, depth);
  }
}
