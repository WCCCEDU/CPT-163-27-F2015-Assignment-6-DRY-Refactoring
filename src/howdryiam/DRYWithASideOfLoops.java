/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package howdryiam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rhonda Marshall
 * Oct 4, 2015
 */
public class DRYWithASideOfLoops {

    /**
     * Driver to show how this problem could be encapsulated in a loop
     */
    public static void main() {
        Scanner keyboard = new Scanner(System.in);
        
        // An ArrayList to store the LabelPrinter instances
        ArrayList<LabelPrinter> labelPrinterList = new ArrayList<>();
     
        // Prompt the user for the label address and label dimensions
        // Store the constructed label in an array
        for (int i = 0; i < 2; i++) {
            Address address = enterAddress(keyboard);
            Dimensions dimension = enterDimensions(keyboard);
            
            labelPrinterList.add(new LabelPrinter(address, dimension));   
        }
    
        // Print the constructed labels from the array
        for (int i = 0; i < 2; i++)
            labelPrinterList.get(i).printLabel();
        
    }
            
    /**
     * constructs an Address instance from user input
     * @param keyboard - A Scanner object
     * @return address - An instance of the Address class
     */
    public static Address enterAddress(Scanner keyboard){
        System.out.printf("Constructing Address\n");
        
        System.out.printf("Enter Attn: ");
    
        String attn = keyboard.nextLine();
            
        System.out.printf("Enter Street: ");
        String street = keyboard.nextLine();
            
        System.out.printf("Enter City: ");
        String city = keyboard.nextLine();
            
        System.out.printf("Enter State: ");
        String state = keyboard.nextLine();
            
        System.out.printf("Enter Zip Code: ");
        int zip = keyboard.nextInt();
            
        System.out.printf("\n");
        
        Address address = new Address(attn, street, city, state, zip);
        
        return address;
    }
    
    /**
     * constructs a Dimensions instance from user input
     * @param keyboard - A Scanner object
     * @return address - An instance of the Dimensions class
     */
    public static Dimensions enterDimensions(Scanner keyboard){
        System.out.printf("Construction Box\n");
            
        System.out.printf("Enter Height: ");
        double height = keyboard.nextDouble();
            
        System.out.printf("Enter Width: ");
        double width = keyboard.nextDouble();
            
        System.out.printf("Enter Depth: ");
        double depth = keyboard.nextDouble();
            
        keyboard.nextLine();
            
        System.out.printf("\n");
    
        Dimensions dimensions = new Dimensions(width, height, depth);
        
        return dimensions;
    } 
}
    
