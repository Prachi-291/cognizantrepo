public class Car {

    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.make = "Honda";
        c1.model = "City";
        c1.year = 2022;

        Car c2 = new Car();
        c2.make = "Hyundai";
        c2.model = "Creta";
        c2.year = 2023;

        c1.displayDetails();
        c2.displayDetails();
    }
}
