package training;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        car2.color = "blue";

        System.out.println("I've painted the cars");
        System.out.println("The color of car1 is " + car1.color);
        System.out.println("The color of car2 is " + car2.color);

    }
}
