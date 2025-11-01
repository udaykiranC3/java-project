import model.*;
import java.util.*;
public class Main {
    private static void trackVehicle(Vehicle vehicle) {
        System.out.println("\n--- Vehicle Tracking ---");
        System.out.println("Vehicle: " + vehicle.getBrand() + " (" + vehicle.getVehicleNumber() + ")");
        String location = vehicle.getLocation().trim().isEmpty() ? "Not Set" : vehicle.getLocation();
        System.out.println("Current Location: " + location);
    }

    private static void updateLocation(Vehicle vehicle, Scanner sc) {
        System.out.print("Enter new location for " + vehicle.getBrand() + ": ");
        sc.nextLine(); 
        String newLocation = sc.nextLine();
        vehicle.setLocation(newLocation);
        System.out.println("✅ Location updated successfully!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            List<Vehicle> vehicles = new ArrayList<>();
            vehicles.add(new Car("KA01AB1234", "Toyota", 1500, 5));
            vehicles.add(new Car("KA09CD5678", "Honda", 1800, 7));
            vehicles.add(new Bike("KA05XY1111", "Yamaha", 800, 150));
            vehicles.add(new Bike("KA03YZ2222", "Kawasaki", 1200, 400));

            System.out.println("===== Welcome to Vehicle Rental System =====");
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your license number: ");
            String license = sc.nextLine();

            Customer customer = new Customer(name, license);

            while (true) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. View All Vehicles");
                System.out.println("2. Rent a Vehicle");
                System.out.println("3. Update Vehicle Location");
                System.out.println("4. Track Vehicle");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("\nAvailable Vehicles:");
                        for (int i = 0; i < vehicles.size(); i++) {
                            System.out.println((i + 1) + ". " + vehicles.get(i));
                        }
                        break;

                    case 2:
                        System.out.print("\nSelect vehicle number to rent: ");
                        int choice = sc.nextInt();
                        System.out.print("Enter number of days: ");
                        int days = sc.nextInt();

                        if (choice < 1 || choice > vehicles.size() || days <= 0)
                            throw new IllegalArgumentException("Invalid input!");

                        Vehicle selected = vehicles.get(choice - 1);
                        Rental rental = new Rental(selected, customer, days);
                        rental.printInvoice();
                        break;

                    case 3:
                        System.out.print("\nEnter vehicle number to update location: ");
                        sc.nextLine();
                        String num = sc.nextLine();
                        boolean found = false;
                        for (Vehicle v : vehicles) {
                            if (v.getVehicleNumber().equalsIgnoreCase(num)) {
                                updateLocation(v, sc);
                                found = true;
                                break;
                            }
                        }
                        if (!found) System.out.println("❌ Vehicle not found!");
                        break;

                    case 4:
                        System.out.print("\nEnter vehicle number to track: ");
                        sc.nextLine();
                        String trackNum = sc.nextLine();
                        boolean tracked = false;
                        for (Vehicle v : vehicles) {
                            if (v.getVehicleNumber().equalsIgnoreCase(trackNum)) {
                                trackVehicle(v);
                                tracked = true;
                                break;
                            }
                        }
                        if (!tracked) System.out.println("❌ Vehicle not found!");
                        break;

                    case 5:
                        System.out.println("Thank you for using Vehicle Rental System!");
                        return;

                    default:
                        System.out.println("❌ Invalid option!");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input! Please enter numbers where required.");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠️ Unexpected error: " + e);
        } finally {
            sc.close();
        }
    }
}

