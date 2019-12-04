package proxy;

public class Caculator implements ICaculator {

    @Override
    public double add(double first, double second) {
        return first + second;
    }

    @Override
    public double divide(double first, double second) {
        return first / second;
    }

}
