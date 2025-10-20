package model;
public class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private double totalRent;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalRent = vehicle.calculateRent(days);
    }

    public void printInvoice() {
        System.out.println("\n----- RENTAL INVOICE -----");
        System.out.println("Customer: " + customer.getName());
        System.out.println("License No: " + customer.getLicenseNumber());
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Days: " + days);
        System.out.println("Total Rent: ₹" + totalRent);
        System.out.println("---------------------------\n");
    }
}
