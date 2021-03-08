package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int index = binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 19);
        System.out.println("binary search: " + index);

        int indexRecursive = recursiveBinarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 0, 20, 9);
        System.out.println("recursive search: " + indexRecursive);

        sortBuuble(new int[]{1, 5, 3, 56, 34, 76, 23, 24, 456, 12});
    }

    public static void print(int i, int b){
        System.out.println(i + " found at index: " + b);
    }


    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }




    public static int recursiveBinarySearch(int[] array, int firstIndex, int lastIndex, int targetNum){

        if(firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;

            if(array[middleIndex] == targetNum){
                return middleIndex;
            }

            if(array[middleIndex] > targetNum){
                return recursiveBinarySearch(array, firstIndex, middleIndex - 1, targetNum);
            }

            return recursiveBinarySearch(array, middleIndex + 1, lastIndex, targetNum);
        }


        return -1;
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static void sortBuuble(int[] array){
        boolean needIteration = true;


        while (needIteration) {

            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }

            }


        }

        System.out.println(Arrays.toString(array));
    }





























}
