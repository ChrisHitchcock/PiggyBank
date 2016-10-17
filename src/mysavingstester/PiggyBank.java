/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysavingstester;

/**
 *
 * @author chhit5249
 */
public class PiggyBank {
    private double money;
    
    public PiggyBank(double inMon)
    {
        money = inMon;
    }
   
    public double addPenny(int amount)
    {
        money += amount*0.01;
        return money;
    }
    
    public double addNickel(int amount)
    {
        money += amount*0.05;
        return money;
    }
    
    public double addDime(int amount)
    {
        money += amount*0.1;
        return money;
    }
    
    public double addQuarter(int amount)
    {
        money += amount*0.25;
        return money;
    }
    
    public double addLoonie(int amount)
    {
        money += amount;
        return money;
    }
    
    public double addToonie(int amount)
    {
        money += amount*2;
        return money;
    }
    
    public String viewBal()
    {
        String output = "You have $"+money+" in your piggy bank.";
        return output;
    }
    
}
