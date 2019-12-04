public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("audio is playing " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MediaPlayerAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        } else {
            System.out.println("Invalid media" + audioType + " format not supported");
        }
    }

}
