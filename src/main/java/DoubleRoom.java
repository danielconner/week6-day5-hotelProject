import java.util.ArrayList;

public class DoubleRoom extends PaidRoom {

    private ArrayList<Guest> inhabitance;

    public DoubleRoom(int capacity, String name, int roomNumber, double price) {
        super(capacity, name, roomNumber, price);
        this.inhabitance = new ArrayList<>();
    }
}
