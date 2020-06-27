package live;

import music.playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v=new Veena();
		v.play();
		playable p=new Veena();
		p.play();
		Saxophone s=new Saxophone();
		s.play();
		playable p1=new Saxophone();
		p1.play();

	}

}
