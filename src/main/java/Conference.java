import java.util.ArrayList;

public class Conference extends PaidRoom{

    private ArrayList<Guest> inhabitance;

    public Conference(int capacity, String name, int roomNumber, double price) {
        super(capacity, name, roomNumber, price);
        this.inhabitance = new ArrayList<>();
    }
}
