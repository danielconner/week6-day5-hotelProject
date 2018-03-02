import java.util.ArrayList;

public class Suite extends PaidRoom {

    private ArrayList<Guest> inhabitance;

    public Suite(int capacity, String name, int roomNumber, double price) {
        super(capacity, name, roomNumber, price);
        this.inhabitance = new ArrayList<>();
    }
}
