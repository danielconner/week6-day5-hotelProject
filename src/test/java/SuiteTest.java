import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuiteTest {

    Suite suite;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Sophia");
        suite = new Suite(RoomType.SUITE.getCapacity(), RoomType.SUITE.getName(), 103, 299.99);
    }

    @Test
    public void getCapacity(){
        assertEquals(6, suite.getCapacity());
    }

    @Test
    public void currentRoomTotal(){
        assertEquals(0, suite.currentRoomTotal());
    }

    @Test
    public void addGuestToRoom(){
        suite.addGuestToRoom(guest);
        assertEquals(1, suite.currentRoomTotal());
    }

    @Test
    public void checkOutGuest(){
        suite.addGuestToRoom(guest);
        suite.checkOutGuest(guest);
        assertEquals(0, suite.currentRoomTotal());
    }

    @Test
    public void getName(){
        assertEquals("Suite", suite.getName());
    }

    @Test
    public void getRoomNumber(){
        assertEquals(103, suite.getRoomNumber());
    }

    @Test
    public void getPrice(){
        assertEquals(299.99, suite.getPrice(), 0.01);
    }
}
