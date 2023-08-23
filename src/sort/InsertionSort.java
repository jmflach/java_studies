package sort;
import java.util.Arrays;

public class InsertionSort {
    public int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        Arrays.sort(this.array);
    }
}