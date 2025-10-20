package model;
public class Bike extends Vehicle {
    private int engineCC;
    public Bike(String vehicleNumber, String brand, double rentPerDay, int engineCC) {
        super(vehicleNumber, brand, rentPerDay);
        this.engineCC = engineCC;
    }
    @Override
    public double calculateRent(int days) {
        double base = getRentPerDay() * days;
        if (engineCC > 250) base += 200;
        return base;
    }
    @Override
    public String getType() { return "Bike"; }

    public int getEngineCC() { return engineCC; }
}
