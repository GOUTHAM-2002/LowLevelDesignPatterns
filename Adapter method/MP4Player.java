public class MP4Player implements VideoPlayer{
    @Override
    public void playAudio(String videoType, String fileName) {
        if (videoType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file. Name: " + fileName);
        } else {
            System.out.println("Invalid video type: " + videoType);
        }
    }
}
