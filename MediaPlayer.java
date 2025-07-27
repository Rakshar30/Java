package demo1;
class Media{
	String title;
	Media(String title){
		this.title=title;
}
	void play(){
		System.out.println("Playing media"+title);
	}
	
}
class AudioMedia extends Media{
	String artist;
	AudioMedia(String title, String artist){
		super(title);
		this.artist=artist;
	}
	public void play() {
		System.out.println("Playing audio "+title+" "+"artist "+artist);
	}
	public void adjustVolume() {
		System.out.println("adjusting volume");
	}
	
}
class VideoMedia extends Media{
	public int durationSeconds;
	VideoMedia(String title, int duration){
		super(title);
		this.durationSeconds=duration;
	}
	public void play() {
		System.out.println("Playing video "+title+ " "+durationSeconds);
	}
	public void skipForward() {
		System.out.println("skipping the media");
	} 
}
public class MediaPlayer {
	public static void main(String[] args) {
	Media[] object=new Media[2];
	object[0]=new AudioMedia("sss", "xx");
	object[1]=new VideoMedia("sss", 30 );
	for(Media md: object) {
		if(md instanceof AudioMedia) {
			AudioMedia a=(AudioMedia) md;
			a.adjustVolume();
		}
		else {
			VideoMedia v=(VideoMedia) md;
			v.skipForward();
		}
		md.play();
	}
	}
}
