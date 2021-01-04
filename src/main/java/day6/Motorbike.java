package day6;

public class Motorbike {
    private String model;
    private String colour;
    private int year;

    public Motorbike(String model, String colour, int year) {
        this.model = model;
        this.colour = colour;
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public void infoMotobike() {
        System.out.println(model + " " + year);
    }

    public int yearDifference(int inputYear) {

        int difference = inputYear - year;
        if (difference < 0) {
            difference = -1 * difference;
        }
        return difference;
    }
}
