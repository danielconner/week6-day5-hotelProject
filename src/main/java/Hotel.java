import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;

public class Hotel extends Room{

    private ArrayList<SingleRoom> singles;
    private ArrayList<DoubleRoom> doubles;
    private ArrayList<Suite> suite;
    private ArrayList<Conference> conference;
    private ArrayList<DiningRoom> dining;
    private ArrayList<Events> events;

    public Hotel(int capacity, String name) {
        super(capacity, name);
        this.singles = new ArrayList<>();
        this.doubles = new ArrayList<>();
        this.suite = new ArrayList<>();
        this.conference = new ArrayList<>();
        this.dining = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public void addRoomToList(SingleRoom room){
        this.singles.add(room);
    }

    public int numberOfSingleRooms(){
        return this.singles.size();
    }

    public int guestCanBeCheckedIn(int number, Guest guest){
        for (SingleRoom room: singles){
            if(room.getRoomNumber() == number){
                room.addGuestToRoom(guest);
            }
        }return this.singles.size();

    }

    public int guestCanbeCheckedOut(int number, Guest guest){
        for (SingleRoom room: singles){
            if(room.getRoomNumber() == number){
                room.checkOutGuest(guest);
            }
        }return this.singles.size();

    }

    

}
