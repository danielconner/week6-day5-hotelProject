import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before(){

        guest = new Guest("Ross");
        diningRoom = new DiningRoom(RoomType.DINING.getCapacity(), RoomType.DINING.getName());
    }

    @Test
    public void getCapacity(){
        assertEquals(15, diningRoom.getCapacity());
    }

    @Test
    public void currentRoomTotal(){
        assertEquals(0, diningRoom.currentRoomTotal());
    }

    @Test
    public void addGuestToRoom(){
        diningRoom.addGuestToRoom(guest);
        assertEquals(1, diningRoom.currentRoomTotal());
    }

    @Test
    public void checkOutGuest(){
        diningRoom.addGuestToRoom(guest);
        diningRoom.checkOutGuest(guest);
        assertEquals(0, diningRoom.currentRoomTotal());
    }

    @Test
    public void getName(){
        assertEquals("Dining", diningRoom.getName());
    }

}
