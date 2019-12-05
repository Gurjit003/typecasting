/*
 * Gurjit Singh
 * Thursday December 5th - 2019
 * This program displays type casting
 */

package typecasting;

/**
 *
 * @author gusin5788
 */
public class Typecasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int integer1 = 6;
        double double1;
        
        double1 = (double)integer1;
        
        System.out.println(integer1 + " as an integer:");
        System.out.println(integer1 + " as a double: " + double1);
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        
        double double2 = 25.0;
        int integer2;
        
        integer2 = (int)double2;
        
        System.out.println(double2 + " as a double:");
        System.out.println(double2 + " as an integer: " + integer2);
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        
        char char1 = 'G';
        String string1;

        string1 = String.valueOf(char1);
        
        System.out.println(char1 + " as a character:");
        System.out.println(char1 + " as a string: " + string1);
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        
        String string2 = "Computer Science";
        char char2;

        char2 = string2.charAt(6);
        
        System.out.println(string2 + " as a string:");
        System.out.println(string2 + "'s character at index 6: " + char2);
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        
        String string3 = "2003";
        int integer3;

        integer3 = Integer.parseInt(string3);
        
        System.out.println(string3 + " as a string:");
        System.out.println(string3 + " as an integer: " + integer3);
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        
        String string4 = "1689.26";
        double double3;

        double3 = Double.parseDouble(string4);
        
        System.out.println(string4 + " as a string:");
        System.out.println(string4 + " as a double: " + double3);
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
    }
    
}
