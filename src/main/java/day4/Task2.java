package day4;


import java.util.Arrays;
import java.util.Random;


/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести в консоль:
-	наибольший элемент массива
-	наименьший элемент массива
-	количество элементов массива, оканчивающихся на 0
-	сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

 */
public class Task2 {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        int balance;
        int counteZero = 0;
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = rand.nextInt(10000);
        } System.out.println(Arrays.toString(massiv));
        int maxNumber = massiv[0];
        int minNumber = massiv[0];
        for (int x : massiv) {
            if (x > maxNumber) {
                maxNumber = x;
            }
        }
        System.out.println("- наибольший элемент массива: " + maxNumber);
        for (int x : massiv) {
            if (x < minNumber) {
                minNumber = x;
            }
        }
        System.out.println("- наименьший элемент массива: " + minNumber);

        for (int x : massiv) {
            balance = x % 10;
            if (balance == 0) {
                counteZero++;
                sum += x;
            }
        }
        System.out.println("- количество элементов массива, оканчивающихся на 0: " + counteZero);
        /*for (int x : massiv) {
            balance = x % 10;
            if (balance == 0) {
            sum += x;
            }
        }*/
        System.out.println("- сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}
