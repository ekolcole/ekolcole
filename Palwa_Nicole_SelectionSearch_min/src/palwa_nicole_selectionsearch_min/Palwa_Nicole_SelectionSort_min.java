package palwa_nicole_selectionsearch_min;

import java.util.Scanner;

public class Palwa_Nicole_SelectionSort_min {

    public static void main(String[] args){
        int i,j;
        Scanner scan= new Scanner(System.in);
        System.out.println("Input array length: ");
        int l= scan.nextInt();
        int A[] = new int[l];
        System.out.println("Input set of elements: ");
        for( i=0; i <l; i++)
        {
        A[i]= scan.nextInt();
        }
        selectionSort(A,l);
    }
        public static void selectionSort(int x[], int y){
        int i,j;
        for( i = 0; i < y - 1; i++)
        {
        int min=i;
        for( j = i + 1; j < y; j++)
        {
        if(x[min] > x[j])
        min=j;
        }
        if(min != i)
        {
        int swap=x[i];
        x[i]=x[min];
        x[min]=swap;
        }
        }
        System.out.println("Sorted Array:");
        for(i = 0; i < y; i++)
        System.out.println(""+x[i]);
    }
}      