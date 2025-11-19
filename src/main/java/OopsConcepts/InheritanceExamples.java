package OopsConcepts;

class Vehicle {
    String vehicleType;
    void start() {
        System.out.println("Vehicle started");
    }
}
class Car extends Vehicle {
    String carModel;
    void displayInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Car Model: " + carModel);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    void displayElectricCarInfo() {
        displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class Bike extends Vehicle {
    String bikeModel;
    void displayBikeInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Bike Model: " + bikeModel);
    }
}

class Truck extends Vehicle {
    String truckModel;
    void displayTruckInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Truck Model: " + truckModel);
    }
}

public class InheritanceExamples {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.vehicleType = "Electric Vehicle";
        electricCar.carModel = "Tesla Model S";
        electricCar.batteryCapacity = 100;
        electricCar.start();
        electricCar.displayElectricCarInfo();
        
        
        // Hierarchial Inheritance Example
        Bike bike = new Bike();
        bike.vehicleType = "Two Wheeler";
        bike.bikeModel = "Yamaha FZ";
        bike.start();
        bike.displayBikeInfo();

        Truck truck = new Truck();
        truck.vehicleType = "Heavy Vehicle";
        truck.truckModel = "Ford F-150";
        truck.start();
        truck.displayTruckInfo();
    }
}
