/*
 * HOW TO CREATE A STATIC BLOCK IN JAVA
 */
package practice;

/**
 *
 * @author palwa
 */
public class Block {
    
    static int year, day;
    static{
        year = 2022;
        day = 30;
        System.out.println("Welcome back to school BISUANS :) ");
    }
    public static void main(String [] args) { // args = an array of sequence of characters (Strings) that are passed to the "main" function
        System.out.println("August "+ day + ", "+ year);
    }
    
}
