package com.anhpd.selectionsort.test.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.anhpd.selectionsort.core.SelectionSort;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class SelectionSortTest {
        // Test mảng tăng dần

    @Test
    public void testSelectionSort1() {
        System.out.println("SelectionSort");
        int[] arr1 = {1, 2, 3, 4, 5};
        SelectionSort.selectionSort(arr1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr1);
    }

    // Test mảng giảm dần 
    @Test
    public void testSelectionSort2() {
        System.out.println("SelectionSort");
        int[] arr2 = {5, 4, 3, 2, 1};
        SelectionSort.selectionSort(arr2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr2);
    }

    // Test mảng có giá trị lặp
    @Test
    public void testSelectionSort3() {
        System.out.println("SelectionSort");
        int[] arr3 = {3, 1, 4, 1, 8, 9, 2, 6, 5, 3, 5};
        SelectionSort.selectionSort(arr3);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 9}, arr3);
    }

    // Test mảng rỗng 
    @Test
    public void testSelectionSort4() {
        System.out.println("SelectionSort");
        int[] arr4 = {};
        SelectionSort.selectionSort(arr4);
        assertArrayEquals(new int[]{}, arr4);
    }

    // Test mảng có số âm 
    @Test
    public void testSelectionSort5() {
        System.out.println("SelectionSort");
        int[] arr5 = {-11, 11, -43, 5, 0};
        SelectionSort.selectionSort(arr5);
        assertArrayEquals(new int[]{-43, -11, 0, 5, 11}, arr5);
    }

    // Test mảng có 1 giá trị 
    @Test
    public void testSelectionSort6() {
        System.out.println("SelectionSort");
        int[] arr5 = {42};
        SelectionSort.selectionSort(arr5);
        assertArrayEquals(new int[]{42}, arr5);
    }
}
