/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author karlkyuden
 */
public class javaArray {
    Scanner input = new Scanner(System.in);
    
    public ArrayList<String> listOfArraysCreated = new ArrayList<String>();
    
    public javaArray(ArrayList arrayTest){
        this.listOfArraysCreated = arrayTest;
    }
    
    private void createArrayList(){
        System.out.println("What is the name of the ArrayList");
        listOfArraysCreated.add(input.nextLine());
    }
    
    private void printArrayList(ArrayList nameOfArray){
        
        System.out.println(nameOfArray.size());
        for(int i = 0; i < nameOfArray.size(); i++){
            System.out.println(nameOfArray.get(i));           
        }   
    }
    
    public javaArray(){  
        displayMenu();
        
    }
    
    private void displayMenu(){
                
        String menuInput = "";
        do{
            System.out.println("Hello there, welcome to my Java Array Portion of"
                    + " my portfolio");
            System.out.println("Here's a menu that will tell you what you can do");
            System.out.println("1) Create an arrayList");
            System.out.println("2) Delete an arrayList");
            System.out.println("3) Add something in the beginning of the arrayList");
            System.out.println("4) Add something in the end of the arrayList");
            System.out.println("5) Pop out the last value of the arrayList");
            System.out.println("6) Pop out the beginning value of the arrayList");
            System.out.println("7) Pop out using the n-th value from the arrayList");
            System.out.println("8) Display an arrayList");
            System.out.println("9) Display the list of created arrayList");
            System.out.println("b) or back) to return to the main menu");
            System.out.print("Please input your choice: ");
            menuInput = input.nextLine();
            
            switch(menuInput){
                case "1":
                    createArrayList();
                    break;
                case "2":
                    System.out.println("Delete an arrayList");
                    break;
                case "3":
                    System.out.println("Adding a value to the beginning");
                    break;
                case "4":
                    System.out.println("Adding a value to the end");
                    break;
                case "5":
                    System.out.println("the last value of the arrayList is: ");
                    break;
                case "6":
                    System.out.println("the beginning value of the arrayList is: ");
                    break;
                case "7":
                    System.out.println("n-th value from the arrayList");
                    break;
                case "8":
                    break;
                case "9":
                    printArrayList(listOfArraysCreated);
                    break;
                case "b":
                case "B":
                case "back":
                case "BACK":
                    System.out.println("\f");
                    break;
                
                
                
                
                default:
                    System.out.println("Invalid Selection");
                    break;
                
            }
            
            
        }while(!menuInput.equalsIgnoreCase("b"));
    }
    
        
}

