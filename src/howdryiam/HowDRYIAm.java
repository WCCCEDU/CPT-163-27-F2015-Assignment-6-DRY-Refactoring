package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	// Dimensions Prep
	double width;
	double depth;
	double height;
	Dimensions dim1;
	Dimensions dim2;
	
	// address Prep
	String name;
	String street;
	String state;
	String city;
	String zip; // Switched to a string because of Zip Codes < 10000, or allow for Zip + 4 
	Address address1;
	Address address2;
		
	
	LabelPrinter label1;
	LabelPrinter label2;
	
	// Preparing First Box
	
	println("Constructing Address one");
        address1 = constructAddress();
	
	println("Constructing Box one");
        dim1 = constructDimensions();
		
	label1 = new LabelPrinter(address1, dim1);
	
	// Preparing Second Box
	
	println("Constructing Address two");
	address2 = constructAddress();
	
	println("Constructing Box two");
	dim2 = constructDimensions();
	
	label2 = new LabelPrinter(address2, dim2);
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  
  
  
  
    public static void println(String message){
	System.out.println(message);
    }

    public static Scanner keyboardInput() {
        return new Scanner(System.in);
    }
    
    private static Address constructAddress() {
        println("Attn:");
	String name = keyboardInput().nextLine();
	println("Street:");
	String street = keyboardInput().nextLine();
	println("City:");
	String city = keyboardInput().nextLine();
	println("State:");
	String state = keyboardInput().nextLine();
	println("ZipCode:");
	String zip = keyboardInput().nextLine();
	
	return new Address(name, street, city, state, zip);
    }

    private static Dimensions constructDimensions() {
        println("Height:");
	double height = keyboardInput().nextDouble();
	println("Width:");
	double  width = keyboardInput().nextDouble();
	println("Depth:");
	double depth = keyboardInput().nextDouble();
	
	return new Dimensions(width, height, depth);
    }
}
