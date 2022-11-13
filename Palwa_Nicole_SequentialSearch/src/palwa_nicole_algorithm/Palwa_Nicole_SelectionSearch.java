package palwa_nicole_algorithm;
//import java.util.Scanner;
public class Palwa_Nicole_SelectionSearch {
    
    public static void main (String[] args){
       int[] A={9,6,8,7,10};
       
    }
    public static void selectionSort (int A[], int l){
    for(int x=0; x<A.length-1; x++ ){
       int s = x;
       for(int y=x; y<l; y++){
           if(A[y]<A[s]){
               s=y;
           }
       }
    }
    }
   }