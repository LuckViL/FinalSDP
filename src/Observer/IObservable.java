package Observer;

public interface IObservable {
    void registerUser(IObserver client);
    void deleteUser(IObserver client);
    void notifyUsers();
}
