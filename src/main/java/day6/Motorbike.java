package day6;

public class Motorbike {
    private String model;
    private int yearOfIssue;

    Motorbike(String model, int yearOfIssue) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;

    }

    public void info() {
        System.out.println("Этот мотоцикл: ");
    }

    public void infoMotobike() {
        System.out.println(model + " " + yearOfIssue);
    }

    public int yearDifference(int inputYear) {
        int difference = inputYear - yearOfIssue;
        if (difference < 0) {
            difference = -1 * difference;
        }
        return difference;
    }
}
