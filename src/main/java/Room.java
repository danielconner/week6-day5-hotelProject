import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> inhabitance;
    private String name;

    public Room(int capacity, String name) {
        this.capacity = capacity;
        this.inhabitance = new ArrayList<>();
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int currentRoomTotal(){
        return this.inhabitance.size();
    }

    public int addGuestToRoom(Guest guest){
        this.inhabitance.add(guest);
        return currentRoomTotal();
    }

    public int checkOutGuest(Guest guest){
        this.inhabitance.remove(guest);
        return currentRoomTotal();
    }

    public String getName() {
        return name;
    }

    public String getGuestName(int index){
        Guest result =  this.inhabitance.get(0);
        return result.getName();
    }


}
