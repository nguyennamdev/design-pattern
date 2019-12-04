package proxy;

public class CaculatorProxy implements ICaculator{

    private Caculator caculator;

    public CaculatorProxy() {
        this.caculator = new Caculator();
    }

    @Override
    public double add(double first, double second) {
        return caculator.add(first, second);
    }

    @Override
    public double divide(double first, double second) {
        if (second == 0)
            throw new RuntimeException("can't divide by 0");
        return caculator.divide(first, second);
    }
}
