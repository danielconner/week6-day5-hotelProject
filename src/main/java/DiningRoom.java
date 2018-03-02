import java.util.ArrayList;

public class DiningRoom extends Room{

    private ArrayList<Guest> inhabitance;

    public DiningRoom(int capacity, String name) {
        super(capacity, name);
        this.inhabitance = new ArrayList<>();
    }


}
