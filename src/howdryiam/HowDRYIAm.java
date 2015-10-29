package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		       
        //Address holds mailing address at each instance
        //Dimensions holds box dimensions at each instance
        Address address1 = address(keyboard);
        Dimensions dim1 = dimension(keyboard);
        Address address2 = address(keyboard);
        Dimensions dim2 = dimension(keyboard);
        
        //label varaibles hold address and dimension information for each label
        LabelPrinter label1 = new LabelPrinter(address1, dim1);
	LabelPrinter label2 = new LabelPrinter(address2, dim2);
        
        //Printing Labels
	label1.printLabel();
	label2.printLabel();
    }   
             
    /**
    *  Method reads and constructs an address object from user info.
    * @param keyboard 
    * @return Address 
    */
        
  public static Address address(Scanner keyboard){	
	println("Constructing Address");
	println("Attn:");
	String attn = keyboard.nextLine();
	println("Street:");
	String street = keyboard.nextLine();
	println("City:");
	String city = keyboard.nextLine();
	println("State:");
	String state = keyboard.nextLine();
	println("ZipCode:");
	int zip = keyboard.nextInt();
         keyboard.nextLine();
        Address address = new Address(attn, street, city, state, zip);
        return address;
  }
 
  /**
   * Method constructs box with height, width and depth dimensions.
   * @param keyboard 
   * @return Dimensions
   */
	
  public static Dimensions dimension(Scanner keyboard){
 	println("Constructing Box");
	println("Height:");
	double height = keyboard.nextDouble();
	println("Width:");
	double width = keyboard.nextDouble();
	println("Depth:");
	double depth = keyboard.nextDouble();
        keyboard.nextLine();
	
	Dimensions dim = new Dimensions(width, height, depth);
        return dim;
  }
 
  /**
   * Method outputs string messages
   * @param message 
   */
  public static void println(String message){
	System.out.println(message);
  }
}
