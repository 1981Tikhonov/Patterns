abstract class Car {
    String licensePlate;
    String color;
    int power;
    double fuel;

    public Car(String licensePlate, String color, int power, double fuel) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.power = power;
        this.fuel = fuel;
    }

    abstract void park();
    abstract void repair();
}

class Truck extends Car {
    public Truck(String licensePlate, String color, int power, double fuel) {
        super(licensePlate, color, power, fuel);
    }

    @Override
    void park() {
        System.out.println("Truck parked");
    }

    @Override
    void repair() {
        System.out.println("Truck repaired");
    }
}

class PassengerCar extends Car {
    public PassengerCar(String licensePlate, String color, int power, double fuel) {
        super(licensePlate, color, power, fuel);
    }

    @Override
    void park() {
        System.out.println("Passenger car parked");
    }

    @Override
    void repair() {
        System.out.println("Passenger car repaired");
    }
}