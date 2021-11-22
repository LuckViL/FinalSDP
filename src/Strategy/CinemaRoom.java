package Strategy;

public class CinemaRoom implements IRoomType{
    @Override
    public void roomType() {
        System.out.println("Cinema room added. Price for hour: 1000 KZT");
    }

    @Override
    public int price() {
        return 1000;
    }
}
