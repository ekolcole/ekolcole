/*
 * HOW TO LOOP THROUGH AN ARRAY IN JAVA
 */
package practice;

/* The loop will print the elements of
 * our array. Wehave used the length
 * property to specify the number of times the
 * loop ia supposed to run.
 */
public class ArrayLoop {
    
        public static void main(String[] args){
            String[] names = {"Queenne", "Nicole", "Angelica", "Louren", "Sherimae"};
            for (int i= 0; i < names.length; i++)
                System.out.println(names[i]);
        }    
}
