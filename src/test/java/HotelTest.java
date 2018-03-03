import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    SingleRoom singleRoom1;
    SingleRoom singleRoom2;

    @Before
    public void before(){
        hotel = new Hotel(160, "The CC Hotel");
        guest1 = new Guest("Danny");
        guest2 = new Guest("Sophia");
        guest3 = new Guest("Liz");
        singleRoom1 = new SingleRoom(RoomType.SINGLE.getCapacity(), RoomType.SINGLE.getName(), 101, 99.99);
        singleRoom2 = new SingleRoom(RoomType.SINGLE.getCapacity(), RoomType.SINGLE.getName(), 102, 99.99);
    }

    @Test
    public void hotelHasSingleRooms(){
        hotel.addRoomToList(singleRoom1);
        assertEquals(1, hotel.numberOfSingleRooms());
    }

    @Test
    public void guestCanBeCheckedIn(){
        hotel.addRoomToList(singleRoom1);
        hotel.addRoomToList(singleRoom2);
        hotel.guestCanBeCheckedIn(102, guest1);
        assertEquals(1, singleRoom2.currentRoomTotal());
    }

    @Test
    public void guestCanBeCheckedOut(){
        hotel.addRoomToList(singleRoom1);
        hotel.addRoomToList(singleRoom2);
        hotel.guestCanBeCheckedIn(102, guest1);
        hotel.guestCanbeCheckedOut(102, guest1);
        assertEquals(0, singleRoom2.currentRoomTotal());
    }

    @Test
    public void canCheckGuestsRoom(){
        hotel.addRoomToList(singleRoom1);
        hotel.addRoomToList(singleRoom2);
        hotel.guestCanBeCheckedIn(102, guest1);
        assertEquals(102, hotel.checkGuestsRoom(0, guest1));
    }


}
