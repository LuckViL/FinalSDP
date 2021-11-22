package Strategy;

public class RoomNo1 extends Room{
    public RoomNo1() {
        super(new FoodRoom(), new PS5Room(), new GameRoom());
    }

    @Override
    public void priceCount() {
        FoodRoom foodRoom = new FoodRoom();
        PS5Room ps5Room = new PS5Room();
        GameRoom gameRoom =  new GameRoom();
        int count = foodRoom.price() + ps5Room.price() + gameRoom.price();
        System.out.println("Room No 1 price is " + count + " KZT");
    }
}
