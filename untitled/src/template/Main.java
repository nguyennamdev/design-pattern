package template;

public class Main {

    public static void main(String[] args) {

        HTML html = new HTML();
        html.printTemplate();

        PDF pdf = new PDF();
        pdf.printTemplate();
    }

}
