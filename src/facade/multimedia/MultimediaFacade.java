package facade.multimedia;

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

    void startStreaming(){
        streaming.startStreaming();
    }
}