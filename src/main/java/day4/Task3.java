package day4;
/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8
(m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

 */

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];
        Random rand = new Random();
        int coumter = 0;
        for (int i = 0; i < matrice.length; i++) {                   //создаем столбцы
            for (int j = 0; j < matrice[i].length; j++) {           //создаем строки
                matrice[i][j] = rand.nextInt(50);             // заполняем случайными числами
            }
        }
        /*for (int i = 0; i < matrice.length; i++) {                  //выводим матрицу в консоль
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");                //промежутки м/у символами в строке
            }
            System.out.println();                                     // переход на новую строку при выведении в консоль
        }
        System.out.println();
        int sumMatrice = 0;
*/
        int maxStroka = 0;
        int index = 0;
        for (int i = 0; i < matrice.length; i++) {
            int stroka = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                //sumMatrice += matrice[i][j];
                stroka += matrice[i][j];
            }
            //System.out.println("сумма " + coumter++ + " строки =" + stroka);
            if (stroka >= maxStroka) {    //присваеваем не строгое неравенство для нахождения последней максимальной суммы строки и выведения ее индекса
                maxStroka = stroka;
                index = i;
            }
        }
        /*
        System.out.println("сумма массива " + sumMatrice);
        System.out.println();
        System.out.println("максимальная сумма строки " + maxStroka);
         */
        System.out.println("Ответ: " + index+ " (индекс строки, сумма чисел в которой максимальна)");
    }

}
