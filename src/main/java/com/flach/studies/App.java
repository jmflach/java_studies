package com.flach.studies;

import com.flach.sort.InsertionSort;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int[] my_array = {9,4,2,3,1,0,5,7,6,8};

        InsertionSort my_InsertionSort = new InsertionSort(my_array);

        System.out.println(Arrays.toString(my_InsertionSort.array));

        my_InsertionSort.sort();

        System.out.println(Arrays.toString(my_InsertionSort.array));
    }
}
