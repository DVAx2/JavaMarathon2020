package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner floor = new Scanner(System.in);
        int floorIn = floor.nextInt();
        if (floorIn < 1) {
            System.out.println("Ошибка ввода");
        } else if (floorIn < 5) {
            System.out.println("Малоэтажный дом");
        } else if (floorIn > 4 && floorIn < 9) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
