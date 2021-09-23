import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    public static void main(String[] args) {

        //get the Users Word
        String word = JOptionPane.showInputDialog("Enter a word with at least one P");
        JOptionPane.showInputDialog(null, splitP(word));
        System.exit(0);
    }
        //Identify the letter P
     public static String splitP(String word){

        int pIndex = word.indexOf('p');

        String split = word.substring(pIndex + 1, pIndex+4);

        return "p" + split;
     }
        //output









}