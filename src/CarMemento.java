class CarMemento {
    private double fuel;

    public CarMemento(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }
}

class CarOriginator {
    private double fuel;

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public CarMemento save() {
        return new CarMemento(fuel);
    }

    public void restore(CarMemento memento) {
        this.fuel = memento.getFuel();
    }
}

