package Final.AntiCafeProject.Observer;

public class Client implements IObserver{
    private String name;

    @Override
    public void update() {
        System.out.println("Some info");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
