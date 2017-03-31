package music;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes=Config.class)//config 불러오는 역활 beans 정보 가져오려는 목적
@RunWith(SpringJUnit4ClassRunner.class)//단일테스트를 위해 

public class MusicTest {
	
	@Autowired//Spring Bean을 넣어줘야 되기때문에 지정해주는데 자동으로 지정
	private Player player;
	
	@Test
	public void playerCheck(){
		assertNotNull(player);
		player.play();
	}

}
