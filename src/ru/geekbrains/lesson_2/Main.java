package ru.geekbrains.lesson_2;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Введите операцию: ");
        System.out.println("1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Деление");
        System.out.println("4.Умножение");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("a = " + a);

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("b = " + b);
        int result;

        if (operation == 1)
        {
            result = a + b;
        }
       else if (operation == 2)
        {
            result = a - b;
        }
       else if (operation == 3)
           result = a / b;
        else
        {
         result = a * b;
        }
        System.out.println("Result is " + result );



    }
}
