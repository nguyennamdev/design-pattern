public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // don't do any thing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 playing " + fileName);
    }
}
