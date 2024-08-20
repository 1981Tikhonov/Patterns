public class Main {
    public static void main(String[] args) {

// Создание участников и трассы
        Race race = new Race();
        Participant p1 = new Participant("Participant 1");
        Participant p2 = new Participant("Participant 2");

        race.addObserver(p1);
        race.addObserver(p2);

        // Создание контрольных пунктов
        Checkpoint cp1 = new MandatoryCheckpoint("CP1", 34.05, -118.25);
        Checkpoint cp2 = new OptionalCheckpoint("CP2", 36.16, -115.15, 2.5);

        race.addCheckpoint(cp1);
        race.addCheckpoint(cp2);

        // Использование Command паттерна
        Car car = new Truck("1234 ABC", "Red", 400, 100);
        Command parkCommand = new ParkCommand(car);
        Command repairCommand = new RepairCommand(car);

        parkCommand.execute();
        repairCommand.execute();

        // Использование Chain of Responsibility паттерна
        CheckpointHandler mandatoryHandler = new MandatoryCheckpointHandler();
        CheckpointHandler optionalHandler = new OptionalCheckpointHandler();
        mandatoryHandler.setNext(optionalHandler);

        mandatoryHandler.handle(cp1);
        mandatoryHandler.handle(cp2);

        // Использование Memento паттерна
        CarOriginator carOriginator = new CarOriginator();
        carOriginator.setFuel(50);
        CarMemento memento = carOriginator.save();
        carOriginator.setFuel(10);
        carOriginator.restore(memento);
        System.out.println("Restored fuel: " + carOriginator.save().getFuel());

        // Использование State паттерна
        CarContext carContext = new CarContext();
        ParkedState parkedState = new ParkedState();
        parkedState.handle(carContext);
        System.out.println(carContext.getState().toString());

        // Использование Strategy паттерна
        NavigationStrategy fastestRoute = new FastestRouteStrategy();
        NavigationStrategy shortestRoute = new ShortestRouteStrategy();
        fastestRoute.navigate();
        shortestRoute.navigate();

        // Использование Visitor паттерна
        CheckpointVisitor visitor = new CheckpointVisitor();
        cp1.accept(visitor);
        cp2.accept(visitor);


    }

}