
/*
 * Karl Jerrenny F. Ojeda
 * Java Portfolio
 * TODO List:
 *      1) Menu
 *      2) ArrayList
 *      3) Data Structures Showcase
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author: Karl Ojeda
 * 
 */
public class JavaApplication1 extends javaArray {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String menuInput;
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("1) The Array Program");
            System.out.println("2) The Sockets Program");
            System.out.println("q) Exit Program");         
            System.out.println("Please enter your choice: ");
            menuInput = reader.next();
            
            
            switch(menuInput){
                case "1":
                    javaArray aTest = new javaArray();
                    break;
                case "2":
                    System.out.println("The Sockets Program has been chosen");
                    break;
                case "q":
                case "quit":
                    System.out.println("Thank you for using the Java Portfolio"
                            + " Program of Karl Ojeda");
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
            
        }while(!menuInput.equalsIgnoreCase("q") && !menuInput.equalsIgnoreCase("quit"));
        
    }
    
}
