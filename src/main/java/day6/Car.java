package day6;

public class Car {
    private int yearOfIssue;
    private String model;
    //private int yearNow;

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Этот автомобиль:");
    }

    int yearDifference(int inputYear) {
        int difference = inputYear - yearOfIssue;
        if (difference < 0) {
            difference = -1 * difference;
        }
        return difference;
    }
}
