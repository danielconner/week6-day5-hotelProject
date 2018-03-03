import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleRoomTest {

    SingleRoom singleRoom;
    Guest guest;

    @Before
    public void before(){
        singleRoom = new SingleRoom(RoomType.SINGLE.getCapacity(), RoomType.SINGLE.getName(), 101, 56.78);
        guest = new Guest("Dave");
    }

    @Test
    public void getCapacity(){
        assertEquals(2, singleRoom.getCapacity());
    }

    @Test
    public void currentRoomTotal(){
        assertEquals(0, singleRoom.currentRoomTotal());
    }

    @Test
    public void addGuestToRoom(){
        singleRoom.addGuestToRoom(guest);
        assertEquals(1, singleRoom.currentRoomTotal());
    }

    @Test
    public void checkOutGuest(){
        singleRoom.addGuestToRoom(guest);
        singleRoom.checkOutGuest(guest);
        assertEquals(0, singleRoom.currentRoomTotal());
    }

    @Test
    public void getName(){
        assertEquals("Single", singleRoom.getName());
    }

    @Test
    public void getRoomNumber(){
        assertEquals(101, singleRoom.getRoomNumber());
    }

    @Test
    public void getPrice(){
        assertEquals(56.78, singleRoom.getPrice(), 0.01);
    }

    @Test
    public void getGuestName(){
        singleRoom.addGuestToRoom(guest);
        assertEquals("Dave", singleRoom.getGuestName(0));

    }

}
