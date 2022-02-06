package ru.geekbrains.lesson2;

import java.util.Random;
import java.util.Scanner;

public class FirstApp {
    public static final int SIZE = 3;
    public static final char DOT = '•';
    public static final char X = 'x';
    public static final char O = 'o';
    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static char arr[][] = new char[SIZE][SIZE];
    public static  char arr1[][] = new char[SIZE + 1][SIZE + 1];
    public static final int DOTS_TO_WIN = 3;

    public static void main(String[] args) {
        setTable();
        while (true) {
            getTable();
            if (humanTurn()){
                System.out.println("Human win");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            getTable();

            if (aiTurn()) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j] == DOT) return false;
            }
        }
        return true;
    }

    public static void setTable() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = DOT;
            }
        }
    }

    public static void getTable() {
            for (int i = 1; i <= SIZE; i++) {
                for (int j = 1; j <= SIZE; j++) {
                    System.out.print(arr[i-1][j-1] + " ");
                }
                System.out.println();
            }
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (arr[x][y] == DOT) return true;
        return false;
    }
    public static boolean humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        arr[x][y] = X;
        if (checkHorOrVerWin(x,y,X)){
            return true;
        }
        return checkDiagonalWin(x,y,X);
    }
    public static boolean aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        arr[x][y] = O;
        if (checkHorOrVerWin(x,y,O)){
            return true;
        }
        return checkDiagonalWin(x,y,O);
    }

    public static boolean checkHorOrVerWin (int x, int y, char c)
    {
        int i = 0;
        boolean returnedValue = false;
        boolean isWin = true;
        for (i = 0; i < SIZE; i++){
            if (arr[x][i] != c){
                isWin = false;
                break;
            }
        }

        if (isWin){
            returnedValue = true;
            return returnedValue;
        }

        isWin = true;
        i = 0;
        for (i = 0; i < SIZE; i++){
            if (arr[i][y] != c){
                isWin = false;
                break;
            }
        }

        if (isWin){
            returnedValue = true;
            return returnedValue;
        }

        return returnedValue;
    }

    public static boolean checkDiagonalWin(int x, int y, char c){
        boolean returnedValue = false;
        boolean isEqual = x == y;

        if (!isEqual && x + y != SIZE - 1){
            return returnedValue;
        }

        boolean isWin = true;
        int i = 0;
        if (isEqual){
            for (i = 0; i < SIZE; i++){
                if (arr[i][i] != c){
                    isWin = false;
                    break;
                }
            }
        }
        else{
            isWin = false;
        }

        if (isWin){
            returnedValue = true;
            return returnedValue;
        }

        isWin = true;
        i = 0;
        for (i = 0; i < SIZE; i++){
            if (arr[i][SIZE - 1 - i] != c){
                isWin = false;
                break;
            }
        }

        if (isWin){
            returnedValue = true;
            return returnedValue;
        }

        return returnedValue;

    }
}