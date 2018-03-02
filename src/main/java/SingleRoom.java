import java.util.ArrayList;

public class SingleRoom extends PaidRoom{

    private ArrayList<Guest> inhabitance;

    public SingleRoom(int capacity, String name, int roomNumber, double price) {
        super(capacity, name, roomNumber, price);
        this.inhabitance = new ArrayList<>();
    }



}