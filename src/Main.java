import java.util.Arrays;
import sort.InsertionSort;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting");

        int[] array = {9,7,1,3,4,2,5,6,8,0};

        InsertionSort my_sort = new InsertionSort(array);

        System.out.println(Arrays.toString(my_sort.array));

        my_sort.sort();

        System.out.println(Arrays.toString(my_sort.array));
    }   
}
