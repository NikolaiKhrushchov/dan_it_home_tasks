package hw_7.task_1;

public class UniversalWarehouse {
    public static void main(String[] args) {
        Warehouse<String> ourWarehouse = new Warehouse<>();

        ourWarehouse.addItem("Car");
        ourWarehouse.addItem("Moped");
        ourWarehouse.addItem("bicycle");

        System.out.println("Number of items stored in the warehouse: " + ourWarehouse.getItemCount());
        System.out.println("List of all items, removing them from the inventory: " + ourWarehouse.retrieveAll());
        System.out.println("List of all items without removal from the warehouse: " + ourWarehouse.viewItems());
        System.out.println("Checking if the warehouse is empty: " + ourWarehouse.isEmpty());
        ourWarehouse.clear();
        System.out.println("Checking the number of empty chests: " + ourWarehouse.isEmpty());
    }
}
