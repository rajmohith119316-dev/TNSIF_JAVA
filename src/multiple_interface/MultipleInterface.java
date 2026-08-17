package multiple_interface;

class SmartPhone implements Camera,MusicPlayer{
	
	@Override
	public void PlayMusic() {
		System.out.println("Playing Music");
	}

	@Override
	public void TakePhoto() {
		System.out.println("Taking Picture");
	
	}
	
}
public class MultipleInterface {

	public static void main(String[] args) {
		SmartPhone s= new SmartPhone();
		s.PlayMusic();
		s.TakePhoto();

	}

	

}
