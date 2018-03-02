import java.util.ArrayList;

public abstract class PaidRoom extends Room {

    private ArrayList<Guest> inhabitance;
    private int roomNumber;
    private double price;


    public PaidRoom(int capacity, String name, int roomNumber, double price) {
        super(capacity, name);
        this.inhabitance = new ArrayList<>();
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }
}





