package howdryiam;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import java.util.Scanner;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
        Address info = addressInformation(keyboard);
        Dimensions unit = dimensionSpecs(keyboard);
        LabelPrinter label = new LabelPrinter(info, unit);
        label.printLabel();//Prints information.  
  }
    /**
     * This adds input to the fields of the class Address.
     * @param keyboard
     * @return 
     */
    public static Address addressInformation(Scanner keyboard){
        
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
	keyboard.nextInt();
        
	Address info = new Address(city, street, city, state, zip);
        return info;
        }
    /**
     * This adds values to the class Dimensions.
     * @param keyboard
     * @return 
     */
    public static Dimensions dimensionSpecs(Scanner keyboard){
        println("Constructing Box: ");
	
        println("Height:");
	double height = keyboard.nextDouble();
	
        println("Width:");
	double width = keyboard.nextDouble();
	
        println("Depth:");
	double depth = keyboard.nextDouble();
        
        keyboard.nextDouble();
	
	Dimensions unit = new Dimensions(width, height, depth);
	return unit; 
    }

  public static void println(String message){
	System.out.println(message);
    }
}
