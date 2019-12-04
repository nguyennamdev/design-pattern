package facade;

public class FaceBookShare implements IShareable {

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
        System.out.println("Facebook share with content" + this.message);
    }
}
