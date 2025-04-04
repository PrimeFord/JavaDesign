package structural.facade.multimedia;

public class FacadeMain {
    public static void main(String[] args) {
        MultiMediaFacade multimedia = new MultiMediaFacade();

        multimedia.playSound();
        multimedia.playVideo();
        multimedia.startStreaming();
    }
}
