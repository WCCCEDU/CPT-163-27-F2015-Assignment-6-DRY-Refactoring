package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
        
        //Address and Dimensions prep
        Address address1;
	Address address2;
	Dimensions dim1;
	Dimensions dim2;	
	
        //Label prep
	LabelPrinter label1;
	LabelPrinter label2;
	
        //Preparing the first Label
        println("Constructing Address one: ");
        address1 = addressSetup(keyboard);	
	
        println("Constructing Box one");	
        dim1 = dimSetup(keyboard);
	
        //Creating the first Label
	label1 = new LabelPrinter(address1, dim1);
	
	//Preparing the second Label
	println("Constructing Address two");	
        address2 = addressSetup(keyboard);
	
        println("Constructing Box two");
        dim2 = dimSetup(keyboard);
	
        //Creating the second label
	label2 = new LabelPrinter(address2, dim2);
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  
  public static Address addressSetup(Scanner keyboard){
    //initializing Address variables
    String attn, street, city, state;
    int zip;
  
    println("Attn:");
    attn = keyboard.next();
    println("Street:");
    street = keyboard.next();
    println("City:");
    city = keyboard.next();
    println("State:");
    state = keyboard.next();
    println("Zip Code:");
    zip = keyboard.nextInt();
    println("");
    
    return new Address(attn, street, city, state, zip);
}
  
  public static Dimensions dimSetup(Scanner keyboard){
    //Initializing the Dimension variables
    double height, width, depth;
      
    println("Height:");
    height = keyboard.nextDouble();
    println("Width:");
    width = keyboard.nextDouble();
    println("Depth:");
    depth = keyboard.nextDouble();
    println("");
    
    return new Dimensions(height, width, depth);
  }
   
  public static void println(String message){
	System.out.println(message);
  }
}
