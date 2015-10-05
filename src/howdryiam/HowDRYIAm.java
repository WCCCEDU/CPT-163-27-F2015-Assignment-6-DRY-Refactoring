package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  public static void main() {
	Scanner keyboard = new Scanner(System.in);
	
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
	int zip;
	Address address1;
	Address address2;
		
	
	LabelPrinter label1;
	LabelPrinter label2;
	
	// Preparing First Box
	
	println("Constructing Address one");
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
	
	address1 = new Address(city, street, city, state, zip);
	
	println("Constructing Box one");
	println("Height:");
	height = keyboard.nextDouble();
	println("Width:");
	width = keyboard.nextDouble();
	println("Depth:");
	depth = keyboard.nextDouble();
	
	dim1 = new Dimensions(width, height, depth);
	
	label1 = new LabelPrinter(address1, dim1);
	
	// Preparing Second Box
	
	println("Constructing Address two");
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
	
	address2 = new Address(city, street, city, state, zip);
	
	println("Constructing Box two");
	println("Height:");
	height = keyboard.nextDouble();
	println("Width:");
	width = keyboard.nextDouble();
	println("Depth:");
	depth = keyboard.nextDouble();
	
	dim2 = new Dimensions(width, height, depth);
	
	label2 = new LabelPrinter(address2, dim2);
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  
  
  public static void println(String message){
	System.out.println(message);
  }
}   