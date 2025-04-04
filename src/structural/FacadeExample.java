package structural;

class AudioPlayer{
    void playAudio(){
        System.out.println("Playing Audio");
    }

    void stopAudio(){
        System.out.println("Stopping Audio");
    }
}

class VideoPlayer{
    void playVideo(){
        System.out.println("Playing Video");
    }

    void stopVideo(){
        System.out.println("Stopping Video");
    }
}

class StreamingService{
    void startStreaming(){
        System.out.println("Streaming Online");
    }

    void stopStreaming(){
        System.out.println("Stopping Streaming");
    }
}

//class StopAudioPlayer{
//    void stopAudio(){
//        System.out.println("Stopping Audio");
//    }
//}

//class stopVideoPlayer{
//    void stopVideo(){
//        System.out.println("Stopping Video");
//    }
//}

//class stopStreamingService{
//    void stopStreaming(){
//        System.out.println("Stopping Streaming");
//    }
//}

class MultiMediaFacade{
    private AudioPlayer audio;
    private VideoPlayer video;
    private StreamingService streaming;

//The Constructor, it has to be the same name as the class

    public MultiMediaFacade(){
        this.audio = new AudioPlayer();
        this.video = new VideoPlayer();
        this.streaming = new StreamingService();
    }

    void playSound(){
        audio.playAudio();
    }

    void playVideo(){
        video.playVideo();
    }

    void streamStart(){
        streaming.startStreaming();
    }

    void stopSound(){
        audio.stopAudio();
    }

    void stopVideo(){
        video.stopVideo();
    }

    void stopStreaming(){
        streaming.stopStreaming();
    }

}
//        this.stopAudio = new StopAudioPlayer();
//        this.stopVideo = new stopVideoPlayer();
//        this.stopStreamingService = new stopStreamingService();

public class FacadeExample {
    public static void main(String[] args) {
        MultiMediaFacade multimedia = new MultiMediaFacade();

        multimedia.playSound();
        multimedia.playVideo();
        multimedia.streamStart();
        multimedia.stopSound();
        multimedia.stopVideo();
        multimedia.stopStreaming();
    }
}
