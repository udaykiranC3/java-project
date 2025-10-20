package model;
public class Car extends Vehicle {
    private int seats;

    public Car(String vehicleNumber, String brand, double rentPerDay, int seats) {
        super(vehicleNumber, brand, rentPerDay);
        this.seats = seats;
    }
    @Override
    public double calculateRent(int days) {
        double base = getRentPerDay() * days;
        if (days > 5) base *= 0.9; // discount
        return base;
    }

    @Override
    public String getType() { return "Car"; }

    public int getSeats() { return seats; }
}
