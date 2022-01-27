package ru.geekbrains.lesson2;

public class FirstApp {
    public static void main(String[] args) {
    int a = 3, b = 15;
    int c = 1900;
    String text = "Printing";
        System.out.print(text);
        System.out.println(sum(a, b));//1
        isPositive(a);//2
        isNegative(b);//3
        printNtimes(a, text);//4
        System.out.println("is it a leap year ? " + isLeapYear(c));//5
    }
//1
    public static boolean sum(int a, int b){
        if ((a+b)<=20 && (a+b)>=10)
            return true;
        else
            return false;
    }
//2
    public static void isPositive(int a) {
        if (a >= 0)
            System.out.println("This number is positive");
        else
            System.out.println("This number is negative");
    }
//3
    public static boolean isNegative (int b){
        if (b < 0)
            return true;
        else
            return false;
    }
//4
    public static void printNtimes(int a, String text){
        for (int i = 0;i < a;i++ ){
        System.out.println(text);
        }
    }
//5
    public static boolean isLeapYear(int c) {
        if (c % 4 == 0 && c % 100 != 0)
            return true;

        else if (c % 100 == 0 && c % 400 == 0) {
            return true;
        }
        else
            return false;
    }
}

