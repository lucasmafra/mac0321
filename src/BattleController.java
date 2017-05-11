import event.Event;
import event.EventController;
import pokemon.Pokemon;
import trainer.Trainer;

public class BattleController extends EventController {
	private Trainer competitors[];
	private boolean isActive;
	
	BattleController() {
		super();
		this.competitors = new Trainer[2];
		this.isActive = true;
	}
	
	public Trainer[] getCompetitors() {
		return competitors;
	}


	public void setCompetitors(Trainer[] competitors) {
		this.competitors = competitors;
	}

	public boolean isActive() {
		return isActive;
	}

	private class RunAway extends Event { //classe interna que representa o evento de fugir da batalha
		private static final int PRIORITY= 4;
		private Trainer trainer;
		
		RunAway(long startTime, Trainer trainer) {
			super(startTime, PRIORITY);
			this.trainer = trainer;
		} 

		@Override
		public void action() {
			isActive = false;
		}

		@Override
		public String getDescription() {
			return this.trainer.getName() + " fugiu da batalha!";
		}
		
	}
	
	private class SwitchPokemon extends Event { //classe interna que representa o evento de trocar o pokemon
		
		private static final int PRIORITY= 3;
		private Pokemon nextPokemon;
		private Trainer trainer;
		
		SwitchPokemon(long startTime, Pokemon pokemon, Trainer trainer) {
			super(startTime, PRIORITY);
		} 

		@Override
		public void action() {
			this.trainer.setCurrentPokemon(this.trainer.indexOf(this.nextPokemon));
		}

		@Override
		public String getDescription() {
			return this.trainer.getName() + " trocou para o pokemon " + this.nextPokemon;
		}
		
	}
	
	
}
