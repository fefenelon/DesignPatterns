package observador;

public class Temperature extends Subject  {
    private double value;

    public Temperature(int i) {
        super();
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
        notifyObservers();
    }
}
