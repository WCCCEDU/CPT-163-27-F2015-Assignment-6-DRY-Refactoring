/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howdryiam;

import java.util.Scanner;

/**
 *
 * @author Rhonda Marshall
 * Oct 4, 2015
 */
public class DRYMethod {

    /**
     * Driver that encapsulates the input gathering into a method
     */
    public static void main() {
        Scanner keyboard = new Scanner(System.in);
        
        LabelPrinter label1 = buildLabel(keyboard);
        LabelPrinter label2 = buildLabel(keyboard);
        
        label1.printLabel();
        label2.printLabel();
    }
    
    /**
     * Constructs a LabelPrinter instance from user input
     * @param keyboard - A Scanner object
     * @return LabelPrinter instance constructed with user input
     */
    public static LabelPrinter buildLabel(Scanner keyboard) {
        // set fields in each field of the LabelPrinter class object
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
            
        System.out.printf("Construction Box\n");
            
        System.out.printf("Enter Height: ");
        double height = keyboard.nextDouble();
            
        System.out.printf("Enter Width: ");
        double width = keyboard.nextDouble();
            
        System.out.printf("Enter Depth: ");
        double depth = keyboard.nextDouble();
            
        keyboard.nextLine();
            
        System.out.printf("\n");
      
        LabelPrinter label = new LabelPrinter(new Address(attn, street, city, state, zip),
                                             new Dimensions(width, height, depth));  
        return label;
    }
    
}
