package Strategy;

public class PS5Room implements IRoomType{
    @Override
    public void roomType() {
        System.out.println("PS room added. Price for hour: 500 KZT");
    }

    @Override
    public int price() {
        return 500;
    }
}
