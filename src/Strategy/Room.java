package Strategy;

public abstract class Room {
    private IRoomType roomType;

    public Room(FoodRoom type, PS5Room ps5Room, IRoomType roomType) {
        this.roomType = roomType;
    }

    public abstract void priceCount();

    public void aboutRoomType(){
        this.roomType.roomType();
        this.roomType.price();
    }

    public IRoomType getRoomType() {
        return roomType;
    }
}
