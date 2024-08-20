// Контрольный пункт (Checkpoint)
    abstract class Checkpoint {
        String name;
        double latitude;
        double longitude;

        public Checkpoint(String name, double latitude, double longitude) {
            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        abstract void accept(Visitor visitor);
    }

    // Обязательный контрольный пункт
    class MandatoryCheckpoint extends Checkpoint {
        public MandatoryCheckpoint(String name, double latitude, double longitude) {
            super(name, latitude, longitude);
        }

        @Override
        void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    // Необязательный контрольный пункт
    class OptionalCheckpoint extends Checkpoint {
        double penalty;

        public OptionalCheckpoint(String name, double latitude, double longitude, double penalty) {
            super(name, latitude, longitude);
            this.penalty = penalty;
        }

        @Override
        void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

