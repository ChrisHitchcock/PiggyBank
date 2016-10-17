/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysavingstester;
import java.util.*;
/**
 *
 * @author chhit5249
 */
public class MySavingsTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("How much money is currently in your piggybank?");
        Scanner kb = new Scanner(System.in);
        double startBal;
        startBal = kb.nextDouble();
        PiggyBank mySavings = new PiggyBank(startBal);
        int choice;
        int amount;
        boolean menu = true;
        
        while (menu == true)
        {
            System.out.println("1.\tView Balance\n2.\tAdd pennies\n3.\tAdd nickels\n4.\tAdd dimes"
                + "\n5.\tAdd quarters\n6.\tAdd loonies\n7.\tAdd toonies\nPress 0 to quit\nEnter your choice: ");
            choice = kb.nextInt();
            switch(choice)
            {
                case 0: menu = false;break;
                case 1: mySavings.viewBal();break;
                case 2: System.out.println("How many pennies will you add?");amount = kb.nextInt();mySavings.addPenny(amount);break;
                case 3: System.out.println("How many nickels will you add?");amount = kb.nextInt();mySavings.addNickel(amount);break;
                case 4: System.out.println("How many dimes will you add?");amount = kb.nextInt();mySavings.addDime(amount);break;
                case 5: System.out.println("How many quarters will you add?");amount = kb.nextInt();mySavings.addQuarter(amount);break;
                case 6: System.out.println("How many loonies will you add?");amount = kb.nextInt();mySavings.addLoonie(amount);break;
                case 7: System.out.println("How many toonies will you add?");amount = kb.nextInt();mySavings.addToonie(amount);break;
            }
        }
    }
    
}
