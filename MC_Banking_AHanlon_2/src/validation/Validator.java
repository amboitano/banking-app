
package validation;

import java.awt.*;
import java.util.Scanner;
import java.lang.*;
import javax.swing.*;


public class Validator {
    public static double getDouble(String message, Scanner sc)
        {
            double number = 0;
            boolean valid = false;
            while (!valid)
            {
                System.out.print(message);
                if (sc.hasNextDouble())
                {
                    number = sc.nextDouble();
                    valid = true;
                }
                else
                {
                    System.out.println("Invalid input! Please try again.");
                    sc.next();
                }
                sc.nextLine();
            }   
            return number;
        }
        
        public static double getDoubleInRange(String message, Scanner sc, double lowerLimit, double upperLimit)
        {
            double number = 0;
            boolean inRange = false;
            while (!inRange)
            {
                number = getDouble(message, sc);
                if (number>=lowerLimit&&number<=upperLimit)
                    inRange = true;
                else
                {
                    System.out.println("The value submitted is not in the range "+lowerLimit+" to "+upperLimit+"! Please try again.");
                    System.out.println();
                }
            }
            return number;
        }
        public static int getInt(String message, Scanner sc)
        {
            int number = 0;
            boolean valid = false;
            while (!valid)
            {
                System.out.print(message);
                if (sc.hasNextInt())
                {
                    number = sc.nextInt();
                    valid = true;
                }
                else
                {
                    System.out.println("Invalid input! Please try again.");
                    sc.next();
                }
                sc.nextLine();
            }   
            return number;
        }
        
        public static int getIntInRange(String message, Scanner sc, int lowerLimit, int upperLimit)
        {
            int number = 0;
            boolean inRange = false;
            while (!inRange)
            {
                number = getInt(message, sc);
                if (number>=lowerLimit&&number<=upperLimit)
                    inRange = true;
                else
                {
                    System.out.println("The value submitted is not in the range "+lowerLimit+" to "+upperLimit+"! Please try again.");
                    System.out.println();
                }
            }
            return number;
        }//end GetIntInRange
        
        public static Component getParentFrame(Component c)
        {
            while (!(c instanceof Frame))
            {
                c = c.getParent();
                if (c==null)
                    break;
            }
            return c;
        }
        
        public static void errorMessage(String message, JTextField txtField)
        {
            JOptionPane.showMessageDialog(getParentFrame(txtField), message, "Invalid input",JOptionPane.ERROR_MESSAGE);
            txtField.setText("");
            txtField.requestFocusInWindow();
        }
        
        public static boolean isTextFieldNotEmpty(JTextField txtField)
        {
            if (txtField.getText().isEmpty())
            {
                errorMessage("Please enter value for "+txtField.getName()+"!", txtField);
                txtField.requestFocusInWindow();
                return false;
            }
            return true;
        }
        
        public static  boolean isTextFieldInt(JTextField txtField)
        {
            if (isTextFieldNotEmpty(txtField))
                if (!TryParseInt(txtField.getText()))
                {
                   errorMessage("Data entered for "+txtField.getName()+" is not a valid integer!\nPlease try again!", txtField);
                   txtField.setText("");
                   txtField.requestFocusInWindow();
                   return false;
                }
            return true;
        }
        
        public static boolean isTextFieldIntInRange(JTextField txtField, int min, int max)
        {
            if (isTextFieldInt(txtField))
            {
                int number = Integer.parseInt(txtField.getText());
                if (number<min||number>max)
                {
                    errorMessage("The entered "+txtField.getName()+" value is not in the range of "+min+" to "+max+"!\nPlease try again.", txtField);
                    txtField.setText("");
                    txtField.requestFocusInWindow();
                }
            }
            return true;
        }
        
        public static boolean isTextFieldDouble(JTextField txtField)
        {
            if (isTextFieldNotEmpty(txtField))
                if(!TryParseDouble(txtField.getText()))
                {
                   errorMessage("Data entered for "+txtField.getName()+" is not a valid number!\nPlease try again!", txtField);
                   txtField.setText("");
                   txtField.requestFocusInWindow();
                   return false;
                }
            return true;
        }
        
        public static boolean isTextFieldDoubleInRange(JTextField txtField, double min, double max)
        {
            if (isTextFieldDouble(txtField))
            {
                double number = Double.parseDouble(txtField.getText());
                if (number<min||number>max)
                {
                    errorMessage("The entered "+txtField.getName()+" value is not in the range of "+min+" to "+max+"!\nPlease try again.", txtField);
                    txtField.setText("");
                    txtField.requestFocusInWindow();
                }
            }
            return true;
        }
        
        public static boolean TryParseInt(String number)
        {
            try {
                Integer.parseInt(number);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
            
        }
        
        public static boolean TryParseDouble(String number)
        {
            try {
                Double.parseDouble(number);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
            
        }
   public static boolean isTextFieldDouble(JTextField t, String title)
    {
        try
        {
            // if you can successfully parse your text, return true - they entered a valid number
            double d = Double.parseDouble(t.getText());
            return true;
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(t, 
                    "Invalid input.  A double expected. \nTry again...", 
                    title, 
                    JOptionPane.ERROR_MESSAGE);
            t.requestFocusInWindow();
            t.selectAll();
            return false;
        }
    }
    public static boolean isTextFieldNonNegativeOrEmpty(JTextField t, String msg)
    {
        boolean bResult = false;
        try
        {
            String entry = t.getText();
            
            double d = Double.parseDouble(entry);
            if (d >= 0)
                bResult = true;
            else if (entry.trim().isEmpty())
            {
                JOptionPane.showMessageDialog(t, msg + " cannot be Empty.", 
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }   
            else
            {
                JOptionPane.showMessageDialog(t, msg + " cannot be less than zero. Try again...", 
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }                    
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(t, msg + " must be a number. Try again...", 
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
                     
        }
        t.requestFocusInWindow();
        t.selectAll(); 
        return bResult;
    }
    
}    

