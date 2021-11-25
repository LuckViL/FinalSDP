package Bridge;

public class ColaOrder extends AdditionalOrder{

    @Override
    public String additionalOrderInfo() {
        drinks.drinkStuff();
        return "100";
    }
}
