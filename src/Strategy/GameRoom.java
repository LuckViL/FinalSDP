package Strategy;

public class GameRoom implements IRoomType{
    @Override
    public void roomType() {
        System.out.println("Game room added. Price for hour: 800 KZT");
    }

    @Override
    public int price() {
        return 800;
    }
}
