package com.flach.studies.sort;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.flach.sort.InsertionSort;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class InsertionSortTests 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sortArray()
    {
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        InsertionSort my_sorter = new InsertionSort(array);

        my_sorter.sort();

        assertTrue( Arrays.equals(my_sorter.array, new int[] {0,1,2,3,4,5,6,7,8,9}));
    }

    @Test
    public void sortArray2()
    {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        InsertionSort my_sorter = new InsertionSort(array);

        my_sorter.sort();

        assertTrue( Arrays.equals(my_sorter.array, new int[] {0,1,2,3,4,5,6,7,8,9}));
    }

    @Test
    public void sortArray3()
    {
        int[] array = {6,5,7,4,8,3,9,2,0,1};
        InsertionSort my_sorter = new InsertionSort(array);

        my_sorter.sort();

        assertTrue( Arrays.equals(my_sorter.array, new int[] {0,1,2,3,4,5,6,7,8,9}));
    }

    @Test
    public void sortArray4()
    {
        int[] array = {6,5,7,4,4,3,9,2,0,1};
        InsertionSort my_sorter = new InsertionSort(array);

        my_sorter.sort();

        assertTrue( Arrays.equals(my_sorter.array, new int[] {0,1,2,3,4,4,5,6,7,9}));
    }

    @Test
    public void sortArray5()
    {
        int[] array = {0};
        InsertionSort my_sorter = new InsertionSort(array);

        my_sorter.sort();

        assertTrue( Arrays.equals(my_sorter.array, new int[] {0}));
    }

    @Test
    public void sortArray6()
    {
        int[] array = {};
        InsertionSort my_sorter = new InsertionSort(array);

        my_sorter.sort();

        assertTrue( Arrays.equals(my_sorter.array, new int[] {}));
    }
}

