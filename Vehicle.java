package model;
import interfaces.Rentable;
public abstract class Vehicle implements Rentable {
    private String vehicleNumber;
    private String brand;
    private double rentPerDay;
    private String location = " ";
    public Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getBrand() { return brand; }
    public double getRentPerDay() { return rentPerDay; }
    public String getLocation() { return location; }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }
    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " | " + brand + " | No: " + vehicleNumber +
                " | Rent/day: ₹" + rentPerDay + " | Location: " + (location.trim().isEmpty() ? "Not Set" : location);
    }
}
