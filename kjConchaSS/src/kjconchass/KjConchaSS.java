package kjconchass;
import java.util.Arrays;
public class KjConchaSS {
    public static void main(String[] args) {
        int[] arr={5,8,4,9,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
    }
        public static void selectionSort(int x[]){
        int a,i;
        for( a = 0; a < x.length - 1; a++)
        {
        int min=a;
        for( i = a + 1; i < x.length; i++)
        {
        if(x[min] > x[i])
        min=i;
        }
        if(min != a)
        {
        int swap=x[a];
        x[a]=x[min];
        x[min]=swap;
        }
        }
        System.out.println("Sorted Array:");
        for(a = 0; a < x.length; a++)
        System.out.println(""+x[a]);
    }
    }