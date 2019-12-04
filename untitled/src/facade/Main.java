package facade;

public class Main {

    public static void main(String[] args) {

        FaceBookShare faceBookShare = new FaceBookShare();
        faceBookShare.setMessage(" Facebook1");

        Twitter twitter = new Twitter();
        twitter.setMessage(" Twitter 1");

        ShareController shareController = new ShareController(faceBookShare, twitter);
        shareController.share();
    }

}
