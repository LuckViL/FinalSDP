package Strategy;

public class FoodRoom implements IFoodRoomType {
    @Override
    public void roomType() {
        System.out.println("Food room price for hour: 400 KZT");
    }

    @Override
    public int price() {
        return 400;
    }
}
