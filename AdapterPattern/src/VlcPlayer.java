public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Vlc playing " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // don't do any thing
    }
}
