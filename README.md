

```markdown
# 🚗 Vehicle Rental System (Java OOP Mini Project)

## 📘 Overview
The **Vehicle Rental System** is a mini-project developed in **Java** using **Object-Oriented Programming (OOP)** principles.  
It allows users to rent vehicles (Cars, Bikes), manage customers, track vehicles, and calculate rent based on usage duration.

This project demonstrates:
- Encapsulation  
- Inheritance  
- Abstraction  
- Polymorphism  
- Interfaces  
- Exception handling  
- Packages and modular design  

---

## 🧩 Project Structure

```

src/
└── vehiclerental/
├── interfaces/
│    └── Rentable.java
├── model/
│    ├── Vehicle.java
│    ├── Car.java
│    ├── Bike.java
│    ├── Customer.java
│    └── Rental.java
└── main/
└── VehicleRentalSystem.java

```

---

## 🧠 OOP Concepts Used

| Concept | Where It’s Used |
|----------|-----------------|
| **Encapsulation** | Private variables in classes with public getters/setters |
| **Inheritance** | `Car` and `Bike` inherit from abstract class `Vehicle` |
| **Abstraction** | Abstract class `Vehicle` defines base structure |
| **Polymorphism** | `calculateRent()` implemented differently for `Car` and `Bike` |
| **Interface** | `Rentable` defines rental contract implemented by vehicles |
| **Exception Handling** | `try-catch` used in vehicle tracking and main logic |
| **Packages** | Code organized under `vehiclerental.interfaces`, `.model`, and `.main` |

---

## ⚙️ Setup Instructions

### 🧱 Requirements
- **Java JDK 17+** (JDK 21 recommended)
- **Eclipse IDE / IntelliJ IDEA**
- Basic understanding of Java OOP concepts

### 🪜 Steps to Run
1. Clone or download the project.
2. Open it in **Eclipse** or your preferred Java IDE.
3. Ensure folder structure matches:
```

src/vehiclerental/interfaces/
src/vehiclerental/model/
src/vehiclerental/main/

````
4. Right-click `VehicleRentalSystem.java` → **Run As → Java Application**

---

## 🚀 Features

✅ Add different types of vehicles (Car, Bike)  
✅ Rent vehicles and calculate rent  
✅ Track vehicle location (default empty, can be updated later)  
✅ Manage customer details  
✅ Use exception handling for input and tracking  
✅ Demonstrates full OOP implementation with packages  

---

## 💻 Example Usage

```java
Car car = new Car("C101", "Tesla", "Model 3", 1500);
Bike bike = new Bike("B202", "Yamaha", "R15", 800);

Customer customer = new Customer("CU001", "Uday Kiran");
Rental rental = new Rental(customer, car, 5); // Rent for 5 days

System.out.println("Total Rent: ₹" + rental.calculateTotalRent());
car.trackVehicle();
````

**Output Example:**

```
Total Rent: ₹7500.0
Location not set yet for vehicle: C101
```

---

## 📂 Package Details

### `vehiclerental.interfaces`

* **Rentable.java** → Interface for rent calculation.

### `vehiclerental.model`

* **Vehicle.java** → Abstract base class for all vehicles.
* **Car.java** → Subclass representing a car.
* **Bike.java** → Subclass representing a bike.
* **Customer.java** → Customer information.
* **Rental.java** → Links customer and vehicle for a rental period.

### `vehiclerental.main`

* **VehicleRentalSystem.java** → Main driver class with `main()` method.

---

## 🧰 Exception Handling Example

```java
try {
    car.trackVehicle();
} catch (Exception e) {
    System.out.println("Error tracking vehicle: " + e.getMessage());
}
```

---

## 🏁 Future Enhancements

* Add file/database storage for rentals and customers
* Add live vehicle location tracking
* Integrate GUI or web interface
* Support more vehicle types

---

## 🧾 License

This project is open-source and free to use for educational purposes.

```

---

```
