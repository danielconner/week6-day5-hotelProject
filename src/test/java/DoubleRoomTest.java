import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleRoomTest {

    DoubleRoom doubleRoom;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Maxine");
        doubleRoom = new DoubleRoom(RoomType.DOUBLE.getCapacity(), RoomType.DOUBLE.getName(), 102, 89.98);
    }

    @Test
    public void getCapacity(){
        assertEquals(4, doubleRoom.getCapacity());
    }

    @Test
    public void currentRoomTotal(){
        assertEquals(0, doubleRoom.currentRoomTotal());
    }

    @Test
    public void addGuestToRoom(){
        doubleRoom.addGuestToRoom(guest);
        assertEquals(1, doubleRoom.currentRoomTotal());
    }

    @Test
    public void checkOutGuest(){
        doubleRoom.addGuestToRoom(guest);
        doubleRoom.checkOutGuest(guest);
        assertEquals(0, doubleRoom.currentRoomTotal());
    }

    @Test
    public void getName(){
        assertEquals("Double", doubleRoom.getName());
    }

    @Test
    public void getRoomNumber(){
        assertEquals(102, doubleRoom.getRoomNumber());
    }

    @Test
    public void getPrice(){
        assertEquals(89.98, doubleRoom.getPrice(), 0.01);
    }
}
