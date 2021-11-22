package Observer;

import java.util.ArrayList;
import java.util.List;

public class Company implements IObservable{
    private List<IObserver> clients = new ArrayList<>();
    //other variables +setter/getter + notify

    @Override
    public void registerUser(IObserver client) {
        this.clients.add(client);
    }

    @Override
    public void deleteUser(IObserver client) {
        this.clients.remove(client);
    }

    @Override
    public void notifyUsers() {
        for (IObserver client: clients){
            client.update();
        }
    }
}
