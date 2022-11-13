package palwa_nicole_binarysearch;
import java.util.Scanner;
public class Palwa_Nicole_BinarySearch {
        public static void main(String[] args) {
    Scanner scan=new Scanner (System.in);
		System.out.println("Enter array length: ");
		int length= scan.nextInt();
                int A[]=new int[length];
		System.out.println("Enter array list: ");
		for(int i=0; i<length; i++){
			A[i]=scan.nextInt();
			}
		System.out.println("Search key: ");
		int key = scan.nextInt();
                int last= length-1;
		binarySearch (A,0,last,key);
		}
        public static void binarySearch(int arr[],int first, int last, int key) {
		int mid= (first + last)/2;
		while ( first <= last ) {
			if (arr [mid] < key ) {
				first = mid +1;
			} else if ( arr[mid]==key) {
			System.out.println("Target key is found at index:" + mid);
			break;
			}else{
				last = mid - 1;
			}
			mid = (first + last )/ 2;
                    }
                    if (first  > last) {
                            System.out.println("Target key is not found!");
                    }
}
}