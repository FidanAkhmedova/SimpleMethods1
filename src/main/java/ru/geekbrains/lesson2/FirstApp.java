package ru.geekbrains.lesson2;

import java.util.Random;
import java.util.Scanner;

public class FirstApp {
    public static void main(String[] args) {
        //1
        int[] array = new int[10];
        fillWithOneOrZero(array);

        //2
        int[] array1 = new int[100];
        fillWithRandom(array1, 100);
        VivodNaEkran(array1);

        //3
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyByTwo(array2);

        //4
        int[][] array3 = new int[4][4];
        twoDimensionalArray(array3);

        //5
        int dlina = 4;
        float someValue = 4.7f;
        arrayWithSomeLength(dlina, someValue);

        //6
        minMax(array2);

        //7
        int[] array4 = {2,2,2,1,2,2,10,1};//{1, 5, 1, 3, 4, 3, 3};
        System.out.println(sum(array4));

        //8
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        if (num > 0)
        changeArray(array2, num);//8.1
        else if (num < 0)
        changeArray1(array2, num);//8.2

    }

    public static void VivodNaEkran(int[] array) {
        for (int j = 0;j < array.length;j++)
            System.out.print(" " + array[j]);
        System.out.println("\n");
    }
    public static void VivodNaEkran1(int[][] array) {
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length;j++){
                System.out.print("\t" + array[i][j]);
            } System.out.println("\n");
        }
    }
    public static void fillWithRandom(int[] array, int bound) {
        Random random = new Random();
        for (int i = 0;i < array.length;i++)
            array[i] = random.nextInt(bound);
    }
    public static void fillWithRandom1(int[][] array, int bound) {
        Random random = new Random();
        for (int i = 0;i < array.length;i++)
        for (int j = 0;j < array.length;j++)
            array[i][j] = random.nextInt(bound);
    }
//1
    public static void fillWithOneOrZero(int[] array) {
        fillWithRandom(array, 2);
        VivodNaEkran(array);
        for (int k = 0;k < array.length;k++){
            if (array[k] == 0)  array[k] = 1;
            else array[k] = 0;
        }
        VivodNaEkran(array);

    }
//3
    public static void multiplyByTwo(int[] array) {
        for (int k = 0; k < array.length; k++) {
            if (array[k] < 6) array[k] *= 2;
        }
        VivodNaEkran(array);
    }
//4
    public static void twoDimensionalArray(int[][] array){
        fillWithRandom1(array, 10);
        VivodNaEkran1(array);
        for (int i = 0;i < array.length;i++)
            for (int k = 0; k < array.length; k++) {
            if (i == k || i + k == array.length-1) array[i][k] = 1;
        }
        System.out.println("After: ");
        VivodNaEkran1(array);
    }
//5
    public static void arrayWithSomeLength(int len, float initialValue){
          float[] arr = new float[len];
          for (int i = 0;i < arr.length;i++)
              arr[i] = initialValue;
          for (int j = 0;j < arr.length;j++)
                System.out.println(" " + arr[j]);
    }
//6
    public static void minMax(int[] array){
        VivodNaEkran(array);
        int min =  array[0];
        int max =  array[0];
        for (int i = 0;i < array.length;i++){
            if (min > array[i])
                min = array[i];
        }
        for (int j = 0;j < array.length;j++){
            if (max < array[j])
                max = array[j];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
//7
    public static boolean sum(int[] array) {
        int sum = 0, sum1;
        for (int i = 0;i < array.length;i++){
            sum1 = 0;
            for (int j = array.length-1;j > i;j--)
                sum1 += array[j];

            sum += array[i];
            if (sum == sum1){
                System.out.println("The sum of left and right sides are equal!!!");
                return true;
            }
        }
        return false;
    }
//8
    public static void changeArray(int[] array, int n) {
        System.out.println("changeArray");
        int w, l = array.length-1;
        while (n > 0){
            w = array[l];
            for (int i = l; i > 0; i--) {
                array[i] = array[i - 1];
            }n--;
            array[0] = w;
        }
        VivodNaEkran(array);
    }
    public static void changeArray1(int[] array, int n){
        int w, k = n *(-1), l = array.length-1;
        while (k > 0){
            w = array[0];
            for (int i = 0; i < l; i++) {
                array[i] = array[i+1];
            }k--;
            array[l] = w;
        }
        VivodNaEkran(array);
        System.out.println("changeArray1");

    }
}
