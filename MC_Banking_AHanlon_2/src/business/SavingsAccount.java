/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author csykes20
 */
public class SavingsAccount extends BankAccount
{
    // Properties
    private String owner;

    // constructors
    public SavingsAccount() {     }
    
    public SavingsAccount(String acctNo, String fName, String lName) {
        super(acctNo, fName, lName);
    }
    
    @Override
    public String getOwner()     {
        return "Savings-" + super.getOwner();
    }
    
        public String AddInterest()     {
        double Balance = super.getBalance();
        if(Balance > 100)
        {
            Balance += (Balance * .02);
        }
        String returnBalance = Double.toString(Balance);
        return(returnBalance);
    }
    
    public String getInterest() {
        double Balance = super.getBalance();
        double interest = 0; 
        
        if(Balance > 100)
        {
            interest = (Balance * .02);
        }
        
        String returnInterest = Double.toString(interest);
        
        return(returnInterest);
    }
}