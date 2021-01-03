package day6;

/*Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и
заправляет топливный бак самолета на это значение.
Создать новый объект класса Самолет с произвольными данными.
Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза,
передав разные значения. Вызвать метод info().
 */
public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Sukhoi Civil Aircraft Company", 2020, 30, 24250);
        airplane.setFuel(0);
        //plane.info();
        airplane.fillUp(5);
        //plane.info();

        Airplane airplane1 = new Airplane("Boeing", 2012, 31, 25400);
        airplane1.setYear(2015);
        airplane1.setLength(35);
        airplane1.fillUp(10);
        airplane1.fillUp(50);
        airplane1.info();
    }

}
