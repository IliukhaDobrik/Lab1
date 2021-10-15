package MainPackege;

public abstract class Food implements Consumable, Nutritious{
    private String _name = null;
    private int _calories = 0;

    public Food(String name, int calories){
        _calories = calories;
        _name = name;
    }

    public int get_calories() {
        return _calories;
    }
    protected void set_calories(int calories) {
        _calories = calories;
    }

    public String get_name() {
        return _name;
    }
    private void set_name(String name) {
        _name = name;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (_name==null || ((Food)arg0)._name==null) return false;
        return _name.equals(((Food)arg0)._name);
    }

    @Override
    public String toString() {
        return _name;
    }
}
