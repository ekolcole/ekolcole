/*
 * HOW TO CREATE A STATIC METHOD IN JAVA
 */
package practice;

public class OddEven {
    
    static int evenNumber;
    
    static void incrementBy2(){
        evenNumber = evenNumber + 2;
        System.out.println(evenNumber);
    }
    public static void main(String[] args){
        incrementBy2();
        incrementBy2();
        incrementBy2();
        incrementBy2();
    }
}
