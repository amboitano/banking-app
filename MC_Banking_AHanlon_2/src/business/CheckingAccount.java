/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import Exceptions.InvalidInputException;
import Exceptions.PotentialOverdraftException;

/**
 *
 * @author csykes20
 */
public class CheckingAccount extends BankAccount
{
    //Member variables
    private final double feePerOverdraft = 10.00;
    private String owner;
    private CheckingAccountType checkingAccountType;
    private double totalOverdraftFee;
    private int numberOfOverdrafts;
    
    //Constructors
    public CheckingAccount()   {
        this.numberOfOverdrafts = 0;
        this.totalOverdraftFee = 0.00;
    }
    
    public CheckingAccount(String acctNo, String fName, String lName)    {
        super(acctNo, fName, lName);
    }
    
    // override getOwner method from BankAccount class
    @Override
    public String getOwner()    {
        return "Checking-" + super.getOwner();
    }
    
    // get Checking Account Type
    public CheckingAccountType getCheckingAccountType()    {
        return checkingAccountType;
    }
    
    // get Over Draft Fees
    public double getOverdraftFee()    {
        return totalOverdraftFee;
    }
   
    // get number of Over Draft Fees
    public int getNumberOfOverdrafts()    {
        return numberOfOverdrafts;
    }
    
    // set Checking account type
    public void setCheckingAccountType(CheckingAccountType checkingAccountType)    {
        this.checkingAccountType = checkingAccountType;
    }
    
    // override withdrawlAmount method from BankAccount class
    @Override
    public boolean WithdrawAmount(double amount, CheckingAccountType type) throws InvalidInputException, PotentialOverdraftException
    {
        boolean status = false;
        boolean overdraft = super.WithdrawAmount(amount, type);
        
        if(overdraft)
        {
            this.totalOverdraftFee += feePerOverdraft;
            numberOfOverdrafts++;
            status = true;
        }
        
        return status;
    }
}