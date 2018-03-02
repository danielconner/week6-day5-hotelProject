public enum RoomType {

        SINGLE(2, "Single"),
        DOUBLE(4, "Double"),
        SUITE(6, "Suite"),
        CONFERENCE(10, "Conference"),
        DINING(15, "Dining"),
        EVENTS(100, "Events");


        private final int capacity;
        private final String name;

    RoomType(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
}

