package day5;
/*
Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setYearOfIssue(2021);
        myCar.setColour("White");
        myCar.setModel("Кама-1");
        myCar.getInfo();
    }
}

class Car {
    private int yearOfIssue;
    private String colour;
    private String model;

    public void setYearOfIssue(int carYear) {
        yearOfIssue = carYear;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColour(String carColor) {
        colour = carColor;
    }

    public String getColour() {
        return colour;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void getInfo(){
        System.out.println("Мой автомобиль " + model + "; год выпуска " + yearOfIssue + "; цвет " + colour + ".");
    }
}
