package facade;

public class Twitter implements IShareable {

    String message;

    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Twitter share with content " + this.message);
    }
}
