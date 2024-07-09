public class MediaAdapter implements MediaPlayer{
    VideoPlayer videoPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            videoPlayer = new MP4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            videoPlayer = new VLCPlayer();
        }
    }

    @Override
    public void playAudio(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            videoPlayer.playVideo("mp4", fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            videoPlayer.playVideo("vlc", fileName);
        }
    }
}
