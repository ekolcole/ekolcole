/*
 * Constructor
 */

package practice;
import java.util.*;
/**
 *
 * @author palwa
 */
public class Student {
    String firstname;
    String lastname;
    int age;
    //Student constructor
    public Student(String firstname, String lastname, int age){
        Scanner scan= new Scanner(System.in);

            System.out.print("Firstname: ");
            firstname = scan.nextLine();
            System.out.print("Lastname: ");
            lastname = scan.nextLine();
            System.out.print("Age: ");
            age = scan.nextInt();
            
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }
    public static void main(String args[]){
        System.out.println(Student.lastname + Student.firstname + Student.age);
    }
}