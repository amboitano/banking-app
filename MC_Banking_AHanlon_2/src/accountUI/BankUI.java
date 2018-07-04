
package accountUI;

import Exceptions.InvalidInputException;
import Exceptions.PotentialOverdraftException;
import business.AccountType;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import validation.Validator;
import java.text.*;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import business.*;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankUI extends javax.swing.JFrame {
CheckingAccount checkingacct;
SavingsAccount savingsacct;
BankAccount bankacct;
    public BankUI() {
        initComponents();
        String  sText  = "<html>Enter Amount to <br/> Deposit: </html>";
        jLabel5.setText (sText);
        String  sText2  = "<html>Enter Amount to <br/> Withdraw: </html>";
        jLabel6.setText (sText2);
        this.setIconImage(new ImageIcon(getClass().getResource("icon2.png")).getImage());
        this.setLocationRelativeTo(this);
        disableButtons();
        //call populateComboBox() method
        populateComboBoxBankAcct();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAcctnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFirstnm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLastnm = new javax.swing.JTextField();
        jComboBoxBankAccount = new javax.swing.JComboBox();
        jRadioBasic = new javax.swing.JRadioButton();
        jRadioPremier = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDepositAmt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldWithdrawAmt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMsg = new javax.swing.JTextArea();
        jButtonWelcome = new javax.swing.JButton();
        jButtonDeposit = new javax.swing.JButton();
        jButtonWithdrawal = new javax.swing.JButton();
        jButtonBalance = new javax.swing.JButton();
        jButtonStatement = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meramec On-line Banking System");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Information"));

        jLabel1.setText("Account:");

        jLabel2.setText("Customer Acct #: ");

        jTextFieldAcctnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAcctnumActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name:");

        jTextFieldFirstnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstnmActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name:");

        buttonGroup1.add(jRadioBasic);
        jRadioBasic.setText("Basic");

        buttonGroup1.add(jRadioPremier);
        jRadioPremier.setSelected(true);
        jRadioPremier.setText("Premier");

        jLabel7.setText("Checking Type:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(36, 36, 36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAcctnum, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLastnm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioBasic)
                    .addComponent(jTextFieldFirstnm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioPremier)
                        .addComponent(jComboBoxBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBasic)
                    .addComponent(jRadioPremier)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAcctnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFirstnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldLastnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Transactions"));

        jTextFieldDepositAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDepositAmtActionPerformed(evt);
            }
        });

        jTextAreaMsg.setColumns(20);
        jTextAreaMsg.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMsg);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDepositAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldWithdrawAmt)))
                .addGap(62, 62, 62))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDepositAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldWithdrawAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonWelcome.setText("Welcome");
        jButtonWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWelcomeActionPerformed(evt);
            }
        });

        jButtonDeposit.setText("Deposit");
        jButtonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositActionPerformed(evt);
            }
        });

        jButtonWithdrawal.setText("Withdrawal");
        jButtonWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWithdrawalActionPerformed(evt);
            }
        });

        jButtonBalance.setText("Show Balance");
        jButtonBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBalanceActionPerformed(evt);
            }
        });

        jButtonStatement.setText("Print Statement");
        jButtonStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatementActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonWelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeposit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonWithdrawal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonStatement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClear)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonExit)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonWelcome)
                    .addComponent(jButtonDeposit)
                    .addComponent(jButtonWithdrawal)
                    .addComponent(jButtonBalance)
                    .addComponent(jButtonStatement)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonExit))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWelcomeActionPerformed
       //local variables
       String accountNo="";
       String fname="";
       String lname="";
       String statusMsg="";
       
       //read user input and assign input to variables
       accountNo=jTextFieldAcctnum.getText();
       fname=jTextFieldFirstnm.getText();
       lname=jTextFieldLastnm.getText();
       if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {
           checkingacct = new CheckingAccount(accountNo,fname,lname);
           if (jRadioBasic.isSelected()) {
               checkingacct.setCheckingAccountType(CheckingAccountType.Basic);
               jTextAreaMsg.setText("Customer: "+checkingacct.getOwner());
           }
           else if (jRadioPremier.isSelected()) {
               checkingacct.setCheckingAccountType(CheckingAccountType.Premier);
               jTextAreaMsg.setText("Customer: "+checkingacct.getOwner());
           }
           else {
           JOptionPane.showMessageDialog(rootPane, "Select Basic or Premier");
           }
      
       }
       else if (jComboBoxBankAccount.getSelectedItem()==AccountType.Savings) {
           savingsacct = new SavingsAccount(accountNo,fname,lname);
           jTextAreaMsg.setText("Customer: "+savingsacct.getOwner());
       }
       else if (jComboBoxBankAccount.getSelectedItem()==AccountType.Money_Market) {
           JOptionPane.showMessageDialog(rootPane, "Monday Market hasn't been implemented");
       }
       else if (jComboBoxBankAccount.getSelectedItem()==AccountType.Money_Market) {
           JOptionPane.showMessageDialog(rootPane, "Certificate of Deposit hasn't been implemented");
       }
       
       jButtonWelcome.setEnabled(false);
       enableButtons();
       
       
    }//GEN-LAST:event_jButtonWelcomeActionPerformed

    private void jButtonDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositActionPerformed
        double amount;
        try {
            amount=Double.parseDouble(jTextFieldDepositAmt.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Deposit amount must be a number");
            return;
        }
        String output="New Deposit: $"+amount;
        output += " Current Balance: $";
        if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {
            checkingacct.depositAmount(amount);
            output+=checkingacct.getBalance();
        }
        else {
            savingsacct.depositAmount(amount);
            output+=savingsacct.getBalance();        
        }
        jTextAreaMsg.setText(output);
    }//GEN-LAST:event_jButtonDepositActionPerformed

    private void jButtonWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWithdrawalActionPerformed
        double amount=0.0;
        
        try {
            amount=Double.parseDouble(jTextFieldWithdrawAmt.getText());
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Withdraw amount must be a number");
           
        }
        String output="New Withdraw: $"+amount;
        output += " Current Balance: $";
        if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {
             try {
                    if (jRadioBasic.isSelected()){
                        checkingacct.WithdrawAmount(amount, CheckingAccountType.Basic);
                    }
                    else {
                       checkingacct.WithdrawAmount(amount, CheckingAccountType.Premier); 
                    }
                    output+=checkingacct.getBalance();
                }
            // This is what I am not sure of - am I doing these exceptions right? It doesn't seem to work.
            catch (IllegalArgumentException | InvalidInputException | PotentialOverdraftException e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
                return;}        
        }
        else {
            //***************YOUR CODE FOR SAVINGS********************
        }
        jTextAreaMsg.setText(output);
    }//GEN-LAST:event_jButtonWithdrawalActionPerformed

    private void jButtonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBalanceActionPerformed
    // get owner of account depending on account type
    String owner;
    if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {   
        owner = checkingacct.getOwner();
    }
    else {
        owner = savingsacct.getOwner();
    }
    
    String output = owner + " - Current Balance: $";
    
    // get balance of checking account or savings account
    if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {
        output+=checkingacct.getBalance();
    }
    else {
        output+=savingsacct.getBalance();
    }
    
    // display output
    JOptionPane.showMessageDialog(rootPane, output);

    }//GEN-LAST:event_jButtonBalanceActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
    //reset all variables
    String accountNo="";
    String fname="";
    String lname="";
    String statusMsg="";
    
    // disable all buttons
    disableButtons();
    
    // enable welcome button
    jButtonWelcome.setEnabled(true);
    
    // reset all text fields to be blank
    resetTextFields();
    }//GEN-LAST:event_jButtonClearActionPerformed

    
    private void jTextFieldDepositAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDepositAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDepositAmtActionPerformed

    private void jTextFieldAcctnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAcctnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAcctnumActionPerformed

    private void jTextFieldFirstnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstnmActionPerformed

    
    private void jButtonStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatementActionPerformed
        String output;
        // display different messages for checking account or savings account
        if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {
            output = "Statement as of Today's Date for " + checkingacct.getOwner() + "\n";
            output += "Checking Account Balance is $" + checkingacct.getBalance() + "\n";
            output += "Amount of OverDraft Fee for the month is $" + checkingacct.getOverdraftFee() + "\n";
            output += "The number of overdrafts for the month is " + checkingacct.getNumberOfOverdrafts();
        }
        else {
            output = "Statement as of Today's Date for " + savingsacct.getOwner() + "\n";
            output += "Savings Account Balance is $" + savingsacct.getBalance() + "\n";
            output += "Interest earned for this month is " + savingsacct.getInterest() + "\n";
            output += "Total Savings Account Balance including interest earned is  " + savingsacct.AddInterest();  
        } 
    
        // display output
        JOptionPane.showMessageDialog(rootPane, output);
    
    }//GEN-LAST:event_jButtonStatementActionPerformed
              

//method to disable buttons
    private void disableButtons() {
        jButtonDeposit.setEnabled(false);
        jButtonWithdrawal.setEnabled(false);
        jButtonStatement.setEnabled(false);
        jButtonBalance.setEnabled(false);
    }
    
    // method to enable buttons
    private void enableButtons() {
      jButtonDeposit.setEnabled(true);
      jButtonWithdrawal.setEnabled(true);
      jButtonStatement.setEnabled(true);
      jButtonBalance.setEnabled(true);
    }
    
    // method to reset text fields when the user presses the "clear" button
    private void resetTextFields() {
        jTextFieldDepositAmt.setText("");
        jTextFieldWithdrawAmt.setText("");
        jTextFieldAcctnum.setText("");       
        jTextFieldFirstnm.setText("");
        jTextFieldLastnm.setText("");
    }
    
    //method to populate jComboBox
    private void populateComboBoxBankAcct(){
        jComboBoxBankAccount.removeAllItems();
        jComboBoxBankAccount.setModel(new DefaultComboBoxModel(AccountType.values()));
        jComboBoxBankAccount.setSelectedIndex(0);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBalance;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDeposit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonStatement;
    private javax.swing.JButton jButtonWelcome;
    private javax.swing.JButton jButtonWithdrawal;
    private javax.swing.JComboBox jComboBoxBankAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioBasic;
    private javax.swing.JRadioButton jRadioPremier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMsg;
    private javax.swing.JTextField jTextFieldAcctnum;
    private javax.swing.JTextField jTextFieldDepositAmt;
    private javax.swing.JTextField jTextFieldFirstnm;
    private javax.swing.JTextField jTextFieldLastnm;
    private javax.swing.JTextField jTextFieldWithdrawAmt;
    // End of variables declaration//GEN-END:variables
}
