package template;

public class HTML extends Print {

    @Override
    void printHeader() {
        System.out.println("---------------------");
        System.out.println("-------HEADER--------");
    }

    @Override
    void printBody() {
        System.out.println("--------BODY---------");
    }

    @Override
    void printFooter() {
        System.out.println("--------FOOTER-------");
    }
}
