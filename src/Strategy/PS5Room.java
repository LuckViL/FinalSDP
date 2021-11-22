package Strategy;

public class PS5Room implements IPSRoomType {
    @Override
    public void roomType() {
        System.out.println("PS 5 room price for hour: 500 KZT");
    }

    @Override
    public int price() {
        return 500;
    }
}
