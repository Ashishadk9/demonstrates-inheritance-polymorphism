import java.util.ArrayList;

// Runner class
public class Runner {
    private ArrayList<Vehicle> vehicles;

    public static void main(String[] args) {
        // Create ArrayList to store vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Create 2 objects of Bike and add to arraylist
        Bike bike1 = new Bike("Mountain Bike", "MB2023", 299.99, "Trek");
        Bike bike2 = new Bike("Road Bike", "RB2023", 499.99, "Giant");
        vehicles.add(bike1);
        vehicles.add(bike2);

        // Create 2 objects of Car and add to arraylist
        Car car1 = new Car("Sedan", "SED2023", 6);
        Car car2 = new Car("SUV", "SUV2023", 8);
        vehicles.add(car1);
        vehicles.add(car2);

        // Using loop, iterate and check instance type
        for (Vehicle vehicle : vehicles) {
            System.out.println("Name: " + vehicle.getName() + ", Model: " + vehicle.getModelNo());

            if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                System.out.println("Type: Bike");
                System.out.println("Price: $" + bike.getPrice());
                System.out.println("Company: " + bike.getCompany());
            } else if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Type: Car");
                System.out.println("Number of Gears: " + car.getNoOfGears());
            }
            System.out.println("|______________________________|");
        }
    }
}