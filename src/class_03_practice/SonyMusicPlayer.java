package class_03_practice;

public class SonyMusicPlayer extends MusicSystem{
	SonyMusicPlayer(){
		System.out.println("Constructor of Sony Music Callled");
	}
	public void play() {
		System.out.println("Playing on Sony music");
	}
	public void pause() {
		System.out.println("Pausing On Sony Music");
	}
	public void stop() {
		System.out.println("Stopping on Sony music");
	}
}
