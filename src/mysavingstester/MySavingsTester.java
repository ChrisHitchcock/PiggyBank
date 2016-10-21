/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysavingstester;

import java.util.*;

/**
 * This program tests the PiggyBank Class.
 * @author Chris Hitchcock
 */
public class MySavingsTester {

    /**
     * Testing happens here.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        double startBal;
        int choice;
        int amount;
        boolean menu = true;
        
        //Prompt for initial balance, and create the PiggyBank.
        System.out.println("How much money is currently in your piggybank($)?");
        Scanner kb = new Scanner(System.in);
        startBal = kb.nextDouble();
        PiggyBank mySavings = new PiggyBank(startBal);
        
        //Error handling if a non-integer choice is selected
        try {
            //While loop that keeps the menu going until user enters 0.
            while (menu == true) {
                //Menu, selections 1-7 and then 0. Get choice.
                System.out.println("1.\tAdd pennies\t2.\tAdd nickels\n3.\tAdd dimes"
                        + "\t4.\tAdd quarters\n5.\tAdd loonies\t6.\tAdd toonies\n"
                        + "7.\tRemove pennies\t8.\tRemove nickels\n9.\tRemove dimes\t"
                        + "10.\tRemove quarters\n11.\tRemove loonies\t12.\tRemove toonies\n"
                        + "13.\tView Balance\t0.\tQuit\nEnter your choice: ");
                choice = kb.nextInt();

                //Switch for choice; prompts for amount if adding coins and then executes the respective methods.
                switch (choice) {
                    // <editor-fold defaultstate="collapsed" desc="Cases for Switch">
                    default:
                        System.out.println("Please enter a valid selection.");
                        break;
                    case 0:
                        System.out.println(mySavings.viewBal(true));
                        menu = false;
                        break;
                    case 1:
                        System.out.println("How many pennies will you add?");
                        amount = kb.nextInt();
                        mySavings.addPenny(amount);
                        break;
                    case 2:
                        System.out.println("How many nickels will you add?");
                        amount = kb.nextInt();
                        mySavings.addNickel(amount);
                        break;
                    case 3:
                        System.out.println("How many dimes will you add?");
                        amount = kb.nextInt();
                        mySavings.addDime(amount);
                        break;
                    case 4:
                        System.out.println("How many quarters will you add?");
                        amount = kb.nextInt();
                        mySavings.addQuarter(amount);
                        break;
                    case 5:
                        System.out.println("How many loonies will you add?");
                        amount = kb.nextInt();
                        mySavings.addLoonie(amount);
                        break;
                    case 6:
                        System.out.println("How many toonies will you add?");
                        amount = kb.nextInt();
                        mySavings.addToonie(amount);
                        break;
                    case 7:
                        System.out.println("How many pennies will you remove?");
                        amount = kb.nextInt();
                        mySavings.remPenny(amount);
                        break;
                    case 8:
                        System.out.println("How many nickels will you remove?");
                        amount = kb.nextInt();
                        mySavings.remNickel(amount);
                        break;
                    case 9:
                        System.out.println("How many dimes will you remove?");
                        amount = kb.nextInt();
                        mySavings.remDime(amount);
                        break;
                    case 10:
                        System.out.println("How many quarters will you remove?");
                        amount = kb.nextInt();
                        mySavings.remQuarter(amount);
                        break;
                    case 11:
                        System.out.println("How many loonies will you remove?");
                        amount = kb.nextInt();
                        mySavings.remLoonie(amount);
                        break;
                    case 12:
                        System.out.println("How many toonies will you remove?");
                        amount = kb.nextInt();
                        mySavings.remToonie(amount);
                        break;
                    case 13:
                        System.out.println(mySavings.viewBal());
                        break;
                        //</editor-fold>
                }

            }
        } catch (InputMismatchException e) {
            //Display cause of error and error message.
            System.out.println("Valid selection not entered.");
            System.err.println("InputMismatchException: " + e.getMessage());
        }
    }
}
