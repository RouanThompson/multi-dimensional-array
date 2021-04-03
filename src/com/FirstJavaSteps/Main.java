package com.FirstJavaSteps;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // int [][] numbers = new int[2][3];
	    // numbers[0][0] = 1;
        // System.out.println(Arrays.deepToString(numbers));
        // int [row][col] numbers
        // deepToString is needed to print multi dimensional array

        int [][] numbers = { { 1, 2 ,3}, {4, 5, 6} };
        // this is a faster way to initialize a multi dimensional array
        System.out.println(Arrays.deepToString(numbers));
    }
}
