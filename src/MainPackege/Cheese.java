package MainPackege;

public class Cheese extends Food{

    public Cheese() {
        super("Cheese", 400);
    }

    @Override
    public void consume() {
        System.out.println(get_name() + "eaten! Yammy!");
    }

    @Override
    public int calculateCalories() {
        return get_calories();
    }
}
