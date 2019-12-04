package template;

public abstract class Print {

    void printTemplate() {
        printHeader();
        printBody();
        printFooter();
    }

    abstract void printHeader();
    abstract void printBody();
    abstract void printFooter();

}
