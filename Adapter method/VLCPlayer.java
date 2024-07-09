public class VLCPlayer implements VideoPlayer{
    @Override
    public void playAudio(String videoType, String fileName) {
        if (videoType.equalsIgnoreCase("vlc")) {
            System.out.println("Playing vlc file. Name: " + fileName);
        } else {
            System.out.println("Invalid video type: " + videoType);
        }
    }
}
