import javax.swing.*;
import java.io.StringBufferInputStream;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing

        public static void main(String[] args) {

        String name = "Abraham";
        String secondName = "Cruz";

        int StringSize = name.length();
        System.out.println("your new Name is: " + FirstName(name, secondName + " " + SecondName(name, secondName)));
    }

    public static String FirstName(String name, String secondName, String word) {
        String FirstHalf = name.substring(0, 3);
        secondName = secondName.substring(3);

        return FirstHalf + secondName;


    }
    public static String SecondName(String name, String secondName1){
        String FristHalf1 = name.substring(3);
        secondName1 = secondName1.substring(0, 3);

        return FristHalf1 + secondName1;
    }
    */

    public static void main(String[] args) {

        String word1 = JOptionPane.showInputDialog("Enter Word 1: ");
        String word2 = JOptionPane.showInputDialog("Enter Word 2: ");
        String word3 = JOptionPane.showInputDialog("Enter Word 3: ");

        String output = lastThree(word1) + lastThree(word2) + lastThree(word3);

        JOptionPane.showInputDialog(null, output);
        System.exit(0);
    }

    public static String lastThree(String word) {

        String newWord;
        if(word.length() <=3){
            newWord = word;
        }else{
            newWord = word.substring(word.length()-3);
        }

        return newWord;
    }
}






























