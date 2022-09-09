package com.java.core;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {3, 4, 2, 7};
        int number = 10;

//        System.out.println("Enter size array:");
//        int size = scanner.nextInt();
//
//        System.out.println("Enter array (split with space or enter):");
//
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++){
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println("Enter sum:");
//        int number = scanner.nextInt();

        System.out.println(Arrays.toString(findPair(number, arr)));
    }

    private static int[] findPair(int target, int[] array) {
        if (array.length < 2)
            return array;

        Arrays.sort(array);

        boolean isNotFound = true;
        int[] result = new int[2];

        int left = 0;
        int right = array.length -1;

        while (left < right && isNotFound){
            int sum = array[left] + array[right];

            if (sum == target){
                result[0] = array[left];
                result[1] = array[right];
            }

            if (sum < target){
                left += 1;
            } else {
                right -= 1;
            }
        }

        return result;
    }

}
