package com.array;

import java.util.Scanner;

public class RotationArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter how many rotations R");
        int r = sc.nextInt();

        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Before rotation");
        for(int a : arr) {
            System.out.print(a + " ");
        }

        arrayRotation(arr, r);

        System.out.println();
        System.out.println("After rotation");

        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    static void arrayRotation(int[] arr, int r) {

        int start = 0;
        int end = arr.length - 1;

        arrayReverse(arr, start, end);
        arrayReverse(arr, start, r - 1);
        arrayReverse(arr, r, end);
    }

    static void arrayReverse(int[] arr, int start, int end) {

        int temp = 0;

        while(start < end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}