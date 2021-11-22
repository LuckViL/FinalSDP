package Strategy;

public class RoomNo1 extends Room{
    public RoomNo1() {
        super(new GameRoom(), new PS5Room(), new FoodRoom(), new CinemaRoom());
    }
}
