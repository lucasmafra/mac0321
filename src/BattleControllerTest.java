import static org.junit.Assert.*;

import org.junit.Test;

import trainer.Trainer;

public class BattleControllerTest {

	@Test
	public void testBattleControllerConstructor() {
		BattleController bc = new BattleController();
		assert(bc.isActive());
		assertEquals(bc.getCompetitors().length, 2);
	}
	
	@Test
	public void testCompetitors() {
		Trainer[] competitors = {new Trainer("Ash", null, null), new Trainer("Trash", null, null)};
		BattleController bc = new BattleController();
		bc.setCompetitors(competitors);
		assert(competitors.equals(bc.getCompetitors()));
	}
	
	@Test
	public void testRunAway(){
		return;
	}
	
}
