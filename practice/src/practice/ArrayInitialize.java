/*
 * HOW TO INITIALIZE AN ARRAY IN JAVA
 */
package practice;

/**
 *
 * @author palwa
 */
public class ArrayInitialize {
    
        public static void main(String[] args){
            String[] names = {"Ericka", "Nicole", "Daniella", "Lida", "Prince"};
            int[] age = {22, 20, 17, 15, 6};

            System.out.print(names[0] + ",");
            System.out.println(age[0]);
            System.out.print(names[1] + ",");
            System.out.println(age[1]);
            System.out.print(names[2] + ",");
            System.out.println(age[2]);
            System.out.print(names[3] + ",");
            System.out.println(age[3]);
            System.out.print(names[4] + ",");
            System.out.println(age[4]);

        /*To check the length of an array using the length property
         * index -> | 0 | 1 | 2 | 3 | 4 |
         * value -> | 22| 20| 17| 15| 6 |
         */
            System.out.println(names.length);
            
        } 
}
