package com.flach.sort;

import java.util.Arrays;
import java.util.ArrayList;

public class InsertionSort {
    public int[] array;

    public InsertionSort(int [] array) {
        this.array = array;
    }

    public void sort() {
        // Arrays.sort(array);
        this.insertionSort();
    }

    private void insertionSort() {
        ArrayList<Integer> new_array = new ArrayList<Integer>();
        for (int i : this.array) {
            this.insert(i, new_array);
        }
        for (int i = 0; i < this.array.length; i++)
        {
            this.array[i] = new_array.get(i);
        }
    }

    private void insert(int element, ArrayList<Integer> list) {
        if (list.size() == 0) list.add(0, element);
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) > element)
            {   
                list.add(i, element);
                return;
            }
            // System.out.println(list.get(i));
        }
        list.add(list.size() - 1, element);
    }
}
