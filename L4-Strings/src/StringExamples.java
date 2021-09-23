import com.sun.xml.internal.stream.events.NamedEvent;

import java.util.Locale;

public class StringExamples {
    public static void main(String[] args){
        String name = "Hephaestus";
        String greeting = "Hello";

        //Style 1
        int StringSize = name.length();
        System.out.println(name + " has " + StringSize + " letters ");

        //Style2
        System.out.println(name + " has " + name.length() + " letters ");

        System.out.println(greeting + " has " + greeting.length() + " letters.");


        //create program witch capitalizes the first letter of a name

        //Attempt1
        //Plan
        //1. Get input
        //2. isolate first letter
        //3. capitalize fist letter
        //4. Isolate the rest of the letters
        //5. put them together.
        //7. display results.

        System.out.println(capFirst(name));

    }

    public static String capFirst(String name){
            String letter = name.substring(0, 1);
            letter = letter.toUpperCase();

            return letter + name.substring(1);
    }
}
