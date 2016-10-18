/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysavingstester;

/**
 * This class allows the user to create a PiggyBank; they can add/remove coins to it
 * and view the balance with the respective methods; initial balance is inputted
 * <p>
 * pre: N/A <br>
 * post: PiggyBank created/modified
 * @author Chris Hitchcock
 */
public class PiggyBank {

    //Variable declaration
    private double money;

    /**
     * Constructor to make the PiggyBank <p>
     * pre: initial balance inputted <br>
     * post: PiggyBank created
     * @param inMon Initial Balance
     */
    public PiggyBank(double inMon) {
        money = inMon;
    }

    /**
     * This method allows the user to add pennies to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: cents added (1cent/penny).
     * @param amount Amount of coins being added
     * @return money; current balance
     */
    public double addPenny(int amount) {
        money += amount * 0.01;
        return money;
    }

    /**
     * This method allows the user to add nickels to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: cents added (5cents/penny).
     * @param amount Amount of coins being added
     * @return money; current balance
     */
    public double addNickel(int amount) {
        money += amount * 0.05;
        return money;
    }

    /**
     * This method allows the user to add dimes to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: cents added (10cents/penny).
     * @param amount Amount of coins being added
     * @return money; current balance
     */
    public double addDime(int amount) {
        money += amount * 0.1;
        return money;
    }

    /**
     * This method allows the user to add quarters to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: cents added (25cents/penny).
     * @param amount Amount of coins being added
     * @return money; current balance
     */
    public double addQuarter(int amount) {
        money += amount * 0.25;
        return money;
    }

    /**
     * This method allows the user to add loonies to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: dollars added (1dollar/penny).
     * @param amount Amount of coins being added
     * @return money; current balance
     */
    public double addLoonie(int amount) {
        money += amount;
        return money;
    }

    /**
     * This method allows the user to add toonies to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: dollars added (2dollars/penny).
     * @param amount Amount of coins being added
     * @return money; current balance
     */
    public double addToonie(int amount) {
        money += amount * 2;
        return money;
    }
    
    /**
     * This method allows the user to remove pennies to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: cents removed (1cent/penny).
     * @param amount Amount of coins being removed
     * @return money; current balance
     */
    public double remPenny(int amount) {
        money -= amount * 0.01;
        return money;
    }

    /**
     * This method allows the user to remove nickels to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: cents removed (5cents/penny).
     * @param amount Amount of coins being removed
     * @return money; current balance
     */
    public double remNickel(int amount) {
        money -= amount * 0.05;
        return money;
    }

    /**
     * This method allows the user to remove dimes to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: cents removed (10cents/penny).
     * @param amount Amount of coins being removed
     * @return money; current balance
     */
    public double remDime(int amount) {
        money -= amount * 0.1;
        return money;
    }

    /**
     * This method allows the user to remove quarters to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: cents removed (25cents/penny).
     * @param amount Amount of coins being removed
     * @return money; current balance
     */
    public double remQuarter(int amount) {
        money -= amount * 0.25;
        return money;
    }

    /**
     * This method allows the user to remove loonies to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: dollars removed (1dollar/penny).
     * @param amount Amount of coins being removed
     * @return money; current balance
     */
    public double remLoonie(int amount) {
        money -= amount;
        return money;
    }

    /**
     * This method allows the user to remove toonies to the Piggy Bank <p>
     * pre: amount inputted <br>
     * post: dollars removed (2dollars/penny).
     * @param amount Amount of coins being removed
     * @return money; current balance
     */
    public double remToonie(int amount) {
        money -= amount * 2;
        return money;
    }

    /**
     * This method sets the balance to a String so it can be outputted <p>
     * pre: N/A <br>
     * post: output returned - balance as a string
     * @return output; money as a String
     */
    public String viewBal() {
        String output = "You have $" + money + " in your piggy bank.";
        return output;
    }

    /**
     * This method sets the balance to a String so it can be outputted, however
     * the statement for this one is final <p>
     * pre: boolean inputted <br>
     * post: output returned - balance as a string
     * @return output; money as a String
     * @param fin Boolean only inputted if program is done.
     */
    public String viewBal(boolean fin) {
        String output = "Your final balance in the Piggy Bank is :$" + money;
        return output;
    }

}
