package proxy;

public class Main {

    public static void main(String[] args) {

        CaculatorProxy caculatorProxy = new CaculatorProxy();
        System.out.println(caculatorProxy.add(3, 5));

        System.out.println("%2f " + caculatorProxy.divide(2, 0));
    }
}
