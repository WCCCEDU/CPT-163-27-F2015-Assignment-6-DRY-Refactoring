package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
    
 public static Address readAddressInfo(){
	Scanner keyboard = new Scanner(System.in);
          
     	println("Constructing Address one");
	println("Attn:");
        String name = "HI";
	//String name = keyboard.next();
	println("Street:");
	String street = keyboard.next();
	println("City:");
	String city = keyboard.next();
	println("State:");
	String state = keyboard.next();
	println("ZipCode:");
	int zip = keyboard.nextInt();
     
     	Address address = new Address(city, street, city, state, zip);
     return address;
     

     
 }
 
 public static Dimensions readDimensionInfor(){
     	Scanner keyboard = new Scanner(System.in);
	
        println("Constructing Box one");
	println("Height:");
	double height = keyboard.nextDouble();
	println("Width:");
	double width = keyboard.nextDouble();
	println("Depth:");
	double depth = keyboard.nextDouble();
	
	Dimensions dim = new Dimensions(width, height, depth);
        
    return dim;
 }
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	
	LabelPrinter label1;
	LabelPrinter label2;
	
        //recalling address for address one with return
	Address address1 = readAddressInfo();
        //recalling address for address two with return
        Address address2 = readAddressInfo();
        //recalling the dimensions for box 1 
        Dimensions dim1 = readDimensionInfor();
        label1 = new LabelPrinter(address1, dim1);
        //recalling dimensions for box 2
        Dimensions dim2= readDimensionInfor();
	label2 = new LabelPrinter(address2, dim2);

	
	//Printing Labels
	label1.printLabel();
	label2.printLabel();
  }
  
  
  public static void println(String message){
	System.out.println(message);
  }
}
