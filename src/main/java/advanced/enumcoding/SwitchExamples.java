package advanced.enumcoding;

import static advanced.enumcoding.SwitchExamples.Day.*;

public class SwitchExamples {
    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat }
    public static void main(String[] args) {
        //The switch statement can have a number of possible execution paths
        //Executes one statement from multiple conditions
        //Switch statement only works with:
        //Primitive data types: byte, short, char and int
        //Enum
        //String class
        //Wrapper Classes: Character, Byte, Short and Integer
        int number = 45;
        String size;

        //The expression is evaluated once and compared with the values of each case
        //The break statement is used to terminate the switch-case statement, if break is not used all the cases
        //after the matching case are also executed
        //If there is no match the code of the default case is executed

        switch(number) {
            case 29:
                size = "XS";
            default:
                size = "Small";

            case 42:
                size = "Medium";

            case 44:
                size = "Large";


        }
        System.out.println("Size: " + size);

        Day day;
        day = Sun;

        //if break is not used, all the cases after the matching case are also executed
        switch(day) {
            case Sun:
            default:
                System.out.println(Sun);

            case Mon:
                System.out.println(Mon);

            case Tue:
                System.out.println(Tue);

            case Wed:
                System.out.println(Wed);
            case Thu:
                System.out.println(Thu);



        }


    }
}
