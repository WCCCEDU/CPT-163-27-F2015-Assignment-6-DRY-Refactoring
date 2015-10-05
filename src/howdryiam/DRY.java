/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Main Driver with a menu to allow you to try out each style of abstraction.
*/
package howdryiam;

import java.util.Scanner;

/**
 *
 * @author Rhonda Marshall
 * Oct 4, 2015
 */
public class DRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Choose 1: To Run DRY With Loops\n" +
                           "Choose 2: To Run DRY with Methods\n" +
                           "Choose 3: To Run Original Program\n");
        System.out.printf("Select: ");
        
        int choice = keyboard.nextInt();
        
        switch(choice){
            case 1: 
                    DRYWithASideOfLoops.main();
                    break;
            case 2:
                    DRYMethod.main();
                    break;
            case 3:
                    HowDRYIAm.main();
                    break;
            default:
        }
    } 
}
