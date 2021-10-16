package MainPackege;

class Sandwich extends Food{
    private String _filling1 = null;
    private String _filling2 = null;

    public Sandwich(String filling1, String filling2) {
        super("Sandwich", 200);
        _filling1 = filling1;
        _filling2 = filling2;
    }

    public String get_filling1() {
        return _filling1;
    }
    private void set_filling1(String filling1) { _filling1 = filling1; }

    public String get_filling2() {
        return _filling2;
    }
    private void set_filling2(String filling2) { _filling2 = filling2; }

    @Override
    public void consume() {
        System.out.println(get_name() + " eaten! :)");
    }

    @Override
    public int calculateCalories() {
        if (get_filling1().equals("Ham"))
            set_calories(get_calories() + 145);
        else if (get_filling1().equals("Chicken"))
            set_calories(get_calories() + 170);
        if (get_filling2().equals("Ketchup"))
            set_calories(get_calories() + 170);
        else if (get_filling2().equals("Mayonnaise"))
            set_calories(get_calories() + 170);
        return get_calories();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Sandwich)) return false;
        return (_filling1.equals(((Sandwich) obj)._filling1) && (_filling2.equals(((Sandwich) obj)._filling2)));
    }

    @Override
    public String toString(){
        return super.toString() + " with " + get_filling1() + " and " + get_filling2();
    }
}
