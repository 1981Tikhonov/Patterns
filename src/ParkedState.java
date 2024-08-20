interface CarState {
    void handle(CarContext context);
}

class ParkedState implements CarState {
    @Override
    public void handle(CarContext context) {
        System.out.println("Car is parked.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Parked State";
    }
}

class RepairedState implements CarState {
    @Override
    public void handle(CarContext context) {
        System.out.println("Car is repaired.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Repaired State";
    }
}

class CarContext {
    private CarState state;

    public CarContext() {
        state = null;
    }

    public void setState(CarState state) {
        this.state = state;
    }

    public CarState getState() {
        return state;
    }
}
