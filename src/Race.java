import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(Checkpoint checkpoint);
}

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Checkpoint checkpoint);
}

class Race implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<Checkpoint> checkpoints = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Checkpoint checkpoint) {
        for (Observer observer : observers) {
            observer.update(checkpoint);
        }
    }

    public void addCheckpoint(Checkpoint checkpoint) {
        checkpoints.add(checkpoint);
        notifyObservers(checkpoint);
    }

    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }
}

class Participant implements Observer {
    String name;

    public Participant(String name) {
        this.name = name;
    }

    @Override
    public void update(Checkpoint checkpoint) {
        System.out.println(name + " notified about checkpoint: " + checkpoint.name);
    }
}