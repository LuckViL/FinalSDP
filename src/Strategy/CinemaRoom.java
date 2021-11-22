package Strategy;

public class CinemaRoom implements ICinemaRoomType {
    @Override
    public void roomType() {
        System.out.println("Cinema room with free drinks. Price for hour: 1000 KZT");
    }

    @Override
    public int price() {
        return 1000;
    }
}
