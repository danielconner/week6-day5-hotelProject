import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventsTest {

    Events events;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Ally");
        events = new Events(RoomType.EVENTS.getCapacity(), RoomType.EVENTS.getName(), 301, 5000.99);
    }

    @Test
    public void getCapacity(){
        assertEquals(100, events.getCapacity());
    }

    @Test
    public void currentRoomTotal(){
        assertEquals(0, events.currentRoomTotal());
    }

    @Test
    public void addGuestToRoom(){
        events.addGuestToRoom(guest);
        assertEquals(1, events.currentRoomTotal());
    }

    @Test
    public void checkOutGuest(){
        events.addGuestToRoom(guest);
        events.checkOutGuest(guest);
        assertEquals(0, events.currentRoomTotal());
    }

    @Test
    public void getName(){
        assertEquals("Events", events.getName());
    }

    @Test
    public void getRoomNumber(){
        assertEquals(301, events.getRoomNumber());
    }

    @Test
    public void getPrice(){
        assertEquals(5000.99, events.getPrice(), 0.01);
    }
}
