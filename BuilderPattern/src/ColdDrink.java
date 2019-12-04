public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new BottlePacking();
    }

    @Override
    public abstract String name();

    @Override
    public abstract Double price();

}
