package day5;
/*
Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
Вывести в консоль значение каждого из полей, используя get методы.
 */

public class Task2 {
    public static void main(String[] args) {
        Motobike myMotobike = new Motobike("Kawasaki", 2020, "multicolour");
        myMotobike.getInfo();
    }
}

class Motobike {
    private int yearOfIssue;
    private String colour;
    private String model;

    public Motobike(String model, int yearOfIssue, String colour) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.colour = colour;
    }

    public void getInfo() {
        System.out.println("Мой мотоцикл " + model + "; год выпуска " + yearOfIssue + "; цвет " + colour + ".");
    }
}
