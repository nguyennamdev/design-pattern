package facade;

public class ShareController {

    FaceBookShare faceBookShare;
    Twitter twitter;

    public ShareController(FaceBookShare faceBookShare) {
        this.faceBookShare = faceBookShare;
    }

    public ShareController(Twitter twitter) {
        this.twitter = twitter;
    }

    public ShareController(FaceBookShare faceBookShare, Twitter twitter) {
        this.faceBookShare = faceBookShare;
        this.twitter = twitter;
    }

    public void share() {
            faceBookShare.share();
            twitter.share();
    }


}
