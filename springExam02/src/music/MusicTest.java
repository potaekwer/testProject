package music;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes=Config.class)//config �ҷ����� ��Ȱ beans ���� ���������� ����
@RunWith(SpringJUnit4ClassRunner.class)//�����׽�Ʈ�� ���� 

public class MusicTest {
	
	@Autowired//Spring Bean�� �־���� �Ǳ⶧���� �������ִµ� �ڵ����� ����
	private Player player;
	
	@Test
	public void playerCheck(){
		assertNotNull(player);
		player.play();
	}

}
