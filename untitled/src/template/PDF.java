package template;

public class PDF extends Print {
    @Override
    void printHeader() {
        System.out.println("-----------PDF----------");
        System.out.println("-----------HEADER----------");
    }

    @Override
    void printBody() {
        System.out.println("-----------BODY---------");
    }

    @Override
    void printFooter() {
        System.out.println("-----------FOOTER-----------");
    }
}
