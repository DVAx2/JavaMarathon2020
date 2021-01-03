package day6;

/*
Создать класс Самолет (Airplane) с полями:
-	producer (изготовитель)
-	year (год выпуска)
-	length (длина)
-	weight (вес)
-	fuel (количество топлива в баке)

Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.

Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
(значение поля “количество топлива в баке” установить равным 0). В конструкторе для передачи полям
значений использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(),
который выводит сообщение в следующем формате:
“Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
*/
public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    int fillUp(int n) {
        int fuelNow = fuel + n;
        this.fuel = fuelNow;
        return fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес:" + weight + ", количество топлива в баке: " + fuel);
    }
}
