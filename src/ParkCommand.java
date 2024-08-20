interface Command {
    void execute();
}

class ParkCommand implements Command {
    private Car car;

    public ParkCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.park();
    }
}

class RepairCommand implements Command {
    private Car car;

    public RepairCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.repair();
    }
}
