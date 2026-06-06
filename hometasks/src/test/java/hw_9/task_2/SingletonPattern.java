package hw_9.task_2;

public class SingletonPattern {
    public static void main(String[] args) {
        Vehicle vehicle1 = Vehicle.getInstance("Bike", 300, 13500);
        Vehicle vehicle2 = Vehicle.getInstance("Car", 190, 30000);
        Vehicle vehicle3 = Vehicle.getInstance("Tractor", 60, 35000);
        Vehicle vehicle4 = Vehicle.getInstance("Scooter", 100, 6000);

        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
        System.out.println(vehicle4);
    }
}
