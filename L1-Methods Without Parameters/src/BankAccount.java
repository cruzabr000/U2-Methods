import javax.swing.*;

public class BankAccount {

    //create a program which simulates a bank account

    public static void main(String[] args) {

     deposit();



    }

    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */

    public static void deposit(){
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter your Balanse"));
        double deposit = Double.parseDouble(JOptionPane.showInputDialog("please enter the a,ount for the deposit"));

        balance += deposit;
        JOptionPane.showInputDialog(null, "Your new balance is: " + balance);

        System.exit(0);
    }


    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */
public static void withddraw(){
    double balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter your balance"));
    double withdraw = Double.parseDouble(JOptionPane.showInputDialog("please enter the amount of the withdraw"));

    balance -= withdraw;

    JOptionPane.showInputDialog(null, "Your new Balance is: " + balance);

    System.exit(0);
}








}
