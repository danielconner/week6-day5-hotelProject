import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference conference;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Sean");
        conference = new Conference(RoomType.CONFERENCE.getCapacity(), RoomType.CONFERENCE.getName(), 201, 500.10);

    }

    @Test
    public void getCapacity(){
        assertEquals(10, conference.getCapacity());
    }

    @Test
    public void currentRoomTotal(){
        assertEquals(0, conference.currentRoomTotal());
    }

    @Test
    public void addGuestToRoom(){
        conference.addGuestToRoom(guest);
        assertEquals(1, conference.currentRoomTotal());
    }

    @Test
    public void checkOutGuest(){
        conference.addGuestToRoom(guest);
        conference.checkOutGuest(guest);
        assertEquals(0, conference.currentRoomTotal());
    }

    @Test
    public void getName(){
        assertEquals("Conference", conference.getName());
    }

    @Test
    public void getRoomNumber(){
        assertEquals(201, conference.getRoomNumber());
    }

    @Test
    public void getPrice(){
        assertEquals(500.10, conference.getPrice(), 0.01);
    }
}
