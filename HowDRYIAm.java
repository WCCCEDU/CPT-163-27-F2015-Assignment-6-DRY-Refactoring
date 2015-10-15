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
        Address info = newAdd(keyboard);
        Dimensions unit = newDim(keyboard);
        LabelPrinter label = new LabelPrinter(info, unit);
        label.printLabel();
      
        
  }
	
    /**
     * Asked the user address information.
     * @param keyboard
     * @return 
     */
    public static Address newAdd(Scanner keyboard){
        
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
     * Takes input from user on deminsons of the box .
     * 
     * @param keyboard
     * @return 
     */
    public static Dimensions newDim(Scanner keyboard){
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



  /**
   * Provides a class for print method
   * @param message 
   */
  public static void println(String message){
	System.out.println(message);
        
       
        
  }
 
}
