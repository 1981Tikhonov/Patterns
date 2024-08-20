abstract class CheckpointHandler {
    protected CheckpointHandler next;

    public void setNext(CheckpointHandler next) {
        this.next = next;
    }

    public abstract void handle(Checkpoint checkpoint);
}

class MandatoryCheckpointHandler extends CheckpointHandler {
    @Override
    public void handle(Checkpoint checkpoint) {
        if (checkpoint instanceof MandatoryCheckpoint) {
            System.out.println("Handling mandatory checkpoint: " + checkpoint.name);
        } else if (next != null) {
            next.handle(checkpoint);
        }
    }
}

class OptionalCheckpointHandler extends CheckpointHandler {
    @Override
    public void handle(Checkpoint checkpoint) {
        if (checkpoint instanceof OptionalCheckpoint) {
            System.out.println("Handling optional checkpoint: " + checkpoint.name);
        } else if (next != null) {
            next.handle(checkpoint);
        }
    }
}
