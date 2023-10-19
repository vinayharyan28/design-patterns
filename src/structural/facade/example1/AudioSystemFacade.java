package structural.facade.example1;

public class AudioSystemFacade {
    private final AudioPlayer player;
    private final Amplifier amplifier;
    private final Speakers speakers;
    private final MixingBoard mixingBoard;
    public AudioSystemFacade(){
        player = new AudioPlayer();
        amplifier = new Amplifier();
        speakers = new Speakers();
        mixingBoard = new MixingBoard();
    }

    public void playAudio(String audio){
        player.play(audio);
        amplifier.setVolume(10);
        mixingBoard.mixAudio();
        speakers.playSound();
    }
}
