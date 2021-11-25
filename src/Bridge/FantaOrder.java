package Bridge;

public class FantaOrder extends AdditionalOrder {

    @Override
    public String additionalOrderInfo() {
        drinks.drinkStuff();
        return "150";
    }
}
