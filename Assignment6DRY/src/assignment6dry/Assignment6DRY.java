package assignment6dry;

import java.util.Scanner;

/**
 *
 * @author Samantha
 */
public class Assignment6DRY {

    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);  //accepts input
        int numLabels;  //stores the number of labels the user wishes to print
        
        //allow user to enter the number of labels they would like to print
        println("Please enter the number of labels you wish to print:");
        numLabels = keyboard.nextInt();
        
        //user can only enter up to 10 labels for this program
        while(numLabels < 1 || numLabels > 10) {
            println("Please enter a number between 1 and 10:");
            numLabels = keyboard.nextInt();
        }
        
        //arrays for storing address and dimension objects
        Address[] addresses = new Address[numLabels];
        Dimensions[] dimensions = new Dimensions[numLabels];
        
        //until the number of labels is reached, user enters label input
        for(int i = 0; i < numLabels;i++){
            inputAddress(addresses, i, keyboard);
            sizeBox(dimensions, i, keyboard);
        };
        
        //after all data has been entered, print labels
        for(int i = 0; i < numLabels; i++) {
            LabelPrinter label = new LabelPrinter(addresses[i], dimensions[i]);
            label.printLabel();
        }
    }
    
    /**
     * Takes a message and prints it to the console
     * @param message string value
     */
    public static void println(String message){
        System.out.println(message);
    }
    
    /**
     * Prompts user to enter address data and then assigns the input to an object
     * in the addresses array
     * @param addresses array filled with address objects
     * @param i integer counter variable
     * @param keyboard Scanner object
     */
    public static void inputAddress(Address[] addresses, int i, Scanner keyboard) {
       //address variables
        String name;
	String street;
	String state;
	String city;
	int zip;
        
        //prompt user for address input
        println("Constructing Address " + (i + 1));
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
        
        //assign user input to Address object in addresses array
        addresses[i] = new Address(name, street, city, state, zip);
    }
    
    /**
     * Prompts user to create size dimensions for the label
     * @param dimensions array of dimension objects
     * @param i integer counter variable
     * @param keyboard scanner object
     */
    public static void sizeBox(Dimensions[] dimensions, int i, Scanner keyboard){
        //dimension variables
        double width;
	double depth;
	double height;
        
        //prompt user for dimensions input
        println("Constructing Box " + (i+1));
	println("Height:");
	height = keyboard.nextDouble();
	println("Width:");
	width = keyboard.nextDouble();
	println("Depth:");
	depth = keyboard.nextDouble();
        
        //assign user input to Dimensions object in dimensions array
        dimensions[i] = new Dimensions(width, height, depth);     
    }
}