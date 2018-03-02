import java.util.ArrayList;

public class Events extends PaidRoom {

    private ArrayList<Guest> inhabitance;

    public Events(int capacity, String name, int roomNumber, double price) {
        super(capacity, name, roomNumber, price);
        this.inhabitance = new ArrayList<>();
    }
}
