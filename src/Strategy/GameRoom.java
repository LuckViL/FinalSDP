package Strategy;

public class GameRoom implements IGameRoomType {
    @Override
    public void roomType() {
        System.out.println("Game room price for hour: 800 KZT");
    }

    @Override
    public int price() {
        return 800;
    }
}
