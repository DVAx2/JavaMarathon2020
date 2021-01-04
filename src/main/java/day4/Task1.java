package day4;
/*
С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в
консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46

 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enter = scanner.nextInt();
        int[] massiv = new int[enter];
        Random rand = new Random();
        int sum = 0;
        int countEight = 0;
        int countOne = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        System.out.println("Введено число " + enter + ". Сгенерирован следующий массив:");

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = rand.nextInt(10);
        }
        System.out.print(Arrays.toString(massiv));
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива:" + massiv.length);
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > 8) {
                countEight++;
            } else if (massiv[i] == 1) {
                countOne++;
            }
        }
        System.out.println("Сумма чисел больше 8: " + countEight);
        System.out.println("Количество чисел равных 1: " + countOne);
        for (int x : massiv) {
            if (x % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        for (int number : massiv) {
            sum += number;
        }
        System.out.println("Сумма всех элементов массива:" + sum);
    }
}
