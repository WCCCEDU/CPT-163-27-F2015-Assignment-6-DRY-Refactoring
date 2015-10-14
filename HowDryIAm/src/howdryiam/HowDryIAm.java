
package howdryiam;

import java.util.Scanner;


public class HowDryIAm {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
         //Creating Label 1
        Address address1 = address(keyboard);
        Dimensions dimensions1 = dimensions(keyboard);
        LabelPrinter label1 = new LabelPrinter (address1, dimensions1); 
         
        //Creatins Label 2
         Address address2 = address(keyboard);
         Dimensions dimensions2 = dimensions(keyboard);
         LabelPrinter label2 = new LabelPrinter (address2, dimensions2); 
         
         label1.printLabel();
         label2.printLabel();
    }
	/**
         * Constructs an Address instance from user input.
         * @param keyboard A Scanner object to provide values for the generation 
         * of Address
         * @return Address instance constructed with user input
         */
        public static Address address (Scanner keyboard){
	// set fields in each field of Address1 class object
	println("Constructing Address");
	println("Attn:");
	String name = keyboard.nextLine();
	println("Street:");
	String street = keyboard.nextLine();
	println("City:");
	String city = keyboard.nextLine();
	println("State:");
	String state = keyboard.nextLine();
	println("ZipCode:");
	int zip = keyboard.nextInt();
	
	//Address set fields
        Address address = new Address(name, street, city, state, zip);
        return address;
        }
        /**
         * Constructs a dimensions instance from user input.
         * @param keyboard A Scanner object to provide values for the generation 
         * of Dimension
         * @return Dimension instance constructed with user input
         */
        public static Dimensions dimensions (Scanner keyboard){
	
	println("Constructing Box one");
	println("Height:");
	double height = keyboard.nextDouble();
	println("Width:");
	double width = keyboard.nextDouble();
	println("Depth:");
	double depth = keyboard.nextDouble();
	
        //Sets fields
	Dimensions dimensions = new Dimensions(width, height, depth);
        return dimensions;
        
        
        
        }
        
  /**
   * 
   * @param message 
   */
  public static void println(String message){
	System.out.println(message);
  }
}