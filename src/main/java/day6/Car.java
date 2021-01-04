package day6;


public class Car {
    private int year;
    private String model;


    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {

        int difference = inputYear - year;
        if (difference < 0) {
            difference = -1 * difference;
        }
        return difference;
    }

}
