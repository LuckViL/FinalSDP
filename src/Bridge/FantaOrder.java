package Bridge;

public class FantaOrder extends com.company.bridge.AdditionalOrder {

    @Override
    public String additionalOrderInfo() {
        drinks.drinkStuff();
        return "150";
    }
}
