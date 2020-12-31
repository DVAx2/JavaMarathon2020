package day4;
/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной
суммой выведите значение суммы и индекс первого элемента тройки.

Пример:
*Для простоты пример показан на массиве размера 10

[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

Тройка с максимальной суммой: [8742, 1040, 3254]

Вывод в консоль:
13036
7

 */

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10000);
        }
        //System.out.println(Arrays.toString(mas));
        int sumMax = 0;
        int counter = 0;
        for (int i = 0; i < mas.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += mas[j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                counter = i;
            }
        }
        System.out.println("максимальная сумма: " + sumMax);
        System.out.print("индекс первого элемента тройки: " + counter);
    }
}
