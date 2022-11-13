package palwa_nicole_algorithm;
import java.util.Scanner;
public class Palwa_Nicole_SequentialSearch {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Input array length: ");
        int length= scan.nextInt();
        int A[] = new int[length];
        System.out.println("Input set of elements: ");
        for(int i=0; i <length; i++)
        {
        A[i]= scan.nextInt();
        }
        System.out.print("Search key: ");
        int K= scan.nextInt();
        search(A,K);
    }
        public static int search (int[] x, int y) {
        for(int i=0; i < x.length; i++){
         if(x[i]== y)
         {
         System.out.println("Index location: "+(i));
         return 1;
         }
        }
         System.out.println("Element not found");
         return -1;
         }
    }