interface Visitor {
    void visit(MandatoryCheckpoint checkpoint);
    void visit(OptionalCheckpoint checkpoint);
}

class CheckpointVisitor implements Visitor {
    @Override
    public void visit(MandatoryCheckpoint checkpoint) {
        System.out.println("Visiting mandatory checkpoint: " + checkpoint.name);
    }

    @Override
    public void visit(OptionalCheckpoint checkpoint) {
        System.out.println("Visiting optional checkpoint: " + checkpoint.name + " with penalty " + checkpoint.penalty);
    }
}