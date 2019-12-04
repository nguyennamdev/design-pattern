public abstract class Burger implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new WrapPacking();
    }

    @Override
    public abstract Double price();

}
