package Strategy;

public abstract class Room {
    private IRoomType roomType;

    public Room(IRoomType roomType) {
        this.roomType = roomType;
    }

    public abstract void display();

    public void aboutRoomType(){
        this.roomType.roomType();
        this.roomType.price();
    }

    public IRoomType getRoomType() {
        return roomType;
    }
}
