package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	LabelPrinter label1;
	LabelPrinter label2;
	
	// Prepping boxes
	Box box1 = prepBox(keyboard,"one");
        Box box2 = prepBox(keyboard,"two");
	
        //creating labels
	label1 = new LabelPrinter(box1.getAddress(), box1.getDimensions());
	label2 = new LabelPrinter(box2.getAddress(), box2.getDimensions());
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  
  public static Box prepBox(Scanner keyboard, String boxName){
        //prep address
        println("Constructing Address " + boxName + ".");
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
        
        //create address object
        Address addr = new Address(name, street, city, state, zip);
        
        //prep dimensions
        println("Constructing box" + boxName + ".");
        println("Height:");
	double height = keyboard.nextDouble();
	println("Width:");
	double width = keyboard.nextDouble();
	println("Depth:");
	double depth = keyboard.nextDouble();
        
        //create dimensions object
        Dimensions dim = new Dimensions(height, width, depth);
        
        //create new box
        Box returnBox = new Box(addr, dim);
        
        //return prepped box
        return returnBox;
  }
  
  public static void println(String message){
	System.out.println(message);
  }
}