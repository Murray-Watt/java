package org.mwatt.tutorial.flow;

public class SwitchExample {

    /*
         A switch works with the byte, short, char, and int primitive data types.
         It also works with enumerated types (discussed in Enum Types), the String class, and a few special classes
         that wrap certain primitive types: Character, Byte, Short, and Integer (discussed in Numbers and Strings).
     */
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
