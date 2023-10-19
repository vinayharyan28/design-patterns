package structural.facade.example1;

public class FacadeClient {
    public static void main(String[] args) {
        AudioSystemFacade audioSystemFacade = new AudioSystemFacade();
        audioSystemFacade.playAudio("code.mp3");
    }
}


/*
* In this example, the AudioSystemFacade provides a simplified interface for playing audio.
* The client code doesn't need to interact with each individual component of the audio system.
* It simply calls playAudio on the facade, which takes care of the complex interactions behind the scenes.
* The Facade pattern helps in reducing complexity and dependencies, making the code more maintainable and easier to use.
*/
