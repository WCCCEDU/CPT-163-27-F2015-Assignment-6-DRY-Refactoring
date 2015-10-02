package howdryiam;
import java.util.Scanner;

public class HowDryIAM {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	LabelPrinter label1;
	LabelPrinter label2;
	
	// Preparing First Box
        println("Constructing Address and Box one");
	label1 = new LabelPrinter(address(keyboard), dimensions(keyboard));
	
	// Preparing Second Box
        println("Constructing Address and Box two");
	label2 = new LabelPrinter(address(keyboard), dimensions(keyboard));
	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  //first address
  public static Address address(Scanner keyboard){
	print("Attn: ");
	String name = keyboard.next();
	print("Street: ");
	String street = keyboard.next();
	print("City: ");
	String city = keyboard.next();
	print("State: ");
	String state = keyboard.next();
	print("ZipCode: ");
	int zip = keyboard.nextInt();
	
	Address address1 = new Address(name, street, city, state, zip);
        return address1;
  }
  //dimensions method
  public static Dimensions dimensions(Scanner keyboard){
	println("");
        print("Box Height: ");
	double height = keyboard.nextDouble();
	print("Box Width: ");
	double width = keyboard.nextDouble();
	print("Box Depth: ");
	double depth = keyboard.nextDouble();
	println("");
        
	Dimensions dim1 = new Dimensions(width, height, depth);
	
	return dim1;
  }
  //println method
  public static void println(String message){
	System.out.println(message);
  }
  //print method
  public static void print(String message){
	System.out.print(message);
  }
}
