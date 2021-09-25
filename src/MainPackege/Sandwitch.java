package MainPackege;

public class Sandwitch extends Food{
    private String _filling1;
    private String _filling2;

    public Sandwitch(String filling1, String filling2) {
        super("Sandwitch", 200);
        _filling1 = filling1;
        _filling2 = filling2;
    }

    public String get_filling1() {
        return _filling1;
    }
    public void set_filling1(String filling1) { _filling1 = filling1; }

    public String get_filling2() {
        return _filling2;
    }
    public void set_filling2(String filling2) { _filling2 = filling2; }

    @Override
    public void consume() {
        System.out.print(get_name() + "eaten! :)");
    }

    @Override
    public int calculateCalories() {

        return get_calories();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Sandwitch)) return false;
        return (_filling1.equals(((Sandwitch) obj)._filling1) && (_filling2.equals(((Sandwitch) obj)._filling2)));
    }

    @Override
    public String toString(){
        return super.toString() + " with" + get_filling1() + " and" + get_filling2();
    }
}
