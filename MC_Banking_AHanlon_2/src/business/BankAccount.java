package business;
import Exceptions.InvalidInputException;
import Exceptions.*;

public class BankAccount 
{
        //Member Variables
        private String acctNumber;
        private String firstName;
        private String lastName;
        private String owner;
        private double balance;
        
        //Constructors
        public BankAccount()
        {
            this.acctNumber = "";
            this.firstName = "";
            this.lastName = "";
            this.owner = "";
            this.balance = 0;
        }
        public BankAccount(String acct, String fName, String lName)
        {
            this.acctNumber = acct;
            this.firstName = fName;
            this.lastName = lName;
        }
        
        //Accessor Functions
        public String getAccountNumber(){return this.acctNumber;}
        public String getFirstName() {return this.firstName;}
        public String getLastName() {return this.lastName;}
        public String getOwner() {return "Account # " + this.acctNumber + " - " + this.firstName + " " + this.lastName;}
        public double getBalance() {return this.balance;}
        
        //Mutator Functions
        public void setAccountNumber(String acctNumber) {this.acctNumber = acctNumber;}
        public void setFirstName(String firstName) {this.firstName = firstName;}
        public void setLastName(String lastName) {this.lastName = lastName;}
        public void setBalance(double Balance)
        {
            if(Balance > 0)
            {
                this.balance = Balance;
            }
            else
            {
                System.out.println("The balance cannot go under $0");
            }
        }
        
        public double depositAmount(double amount) {
            return this.balance+=amount;
    }
        
        public boolean WithdrawAmount(double withdraw, CheckingAccountType type) throws InvalidInputException, PotentialOverdraftException
        {
            boolean overdraftFlag = false; //Initialize false as a matter of principle
            
            if(withdraw <= 300) //if the withdraw value is under the maximum allowed value no error is thrown
            {
                if(withdraw > 0)
                {
                    if(this.balance - withdraw > 0) //No negative values are allowed so throw an error if the users attempts that
                    {
                        this.balance -= withdraw; //run the withdrawal
                    }
                    else
                    {
                        if(type.toString().equals("Basic")) //If the account type is basic then you can't overdraft
                        {
                            throw new InvalidInputException("Insufficient funds. Please enter a smaller amount");
                        }
                        overdraftFlag = true; //flip overdraft flag
                    }
                }
                else
                {
                    throw new InvalidInputException("No negative withdrawal amounts are allowed. Please enter a valid amount.");
                }
            }
            else
            {
                throw new PotentialOverdraftException("Your daily maximum withdrawal is $300 dollars or less. Please enter a smaller amount.");
            }
            return overdraftFlag;
        }
}