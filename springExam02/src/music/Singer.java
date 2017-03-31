package music;

import org.springframework.stereotype.Component;

@Component//spring bean  지정하는 역활
public class Singer implements Player{

	@Override
	public void play() {

		System.out.println("노래 부르기");		
	}

	
}
