package Strategy;

public class FoodRoom implements IRoomType{
    @Override
    public void roomType() {
        System.out.println("Food room added. Price for hour: 400 KZT");
    }

    @Override
    public int price() {
        return 400;
    }
}
