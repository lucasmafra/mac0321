import event.Event;
import event.EventController;
import pokemon.Pokemon;
import pokemon.PokemonAttack;
import trainer.Item;
import trainer.Trainer;

public class BattleController extends EventController {
	private Trainer[] competitors;
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
		private static final int PRIORITY= 4; //maior prioridade comparado com os demais
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
			return trainer.getName() + " fugiu da batalha!";
		}
		
	}
	
	private class SwitchPokemon extends Event { //classe interna que representa o evento de trocar o pokemon
		
		private static final int PRIORITY= 3;
		private Pokemon nextPokemon;
		private Trainer trainer;
		
		SwitchPokemon(long startTime, Pokemon pokemon, Trainer trainer) {
			super(startTime, PRIORITY);
			this.nextPokemon = pokemon;
			this.trainer = trainer;
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
	
	private class UseItem extends Event { //classe interna que representa o evento de usar um item
		
		private static final int PRIORITY= 2;
		private Pokemon pokemon;
		private Trainer trainer;
		private Item item;
		private int difference;
		
		UseItem(long startTime, Pokemon pokemon, Trainer trainer, Item item) {
			super(startTime, PRIORITY);
			this.pokemon = pokemon;
			this.trainer = trainer;
			this.item = item;
		}

		@Override
		public void action() {
			int oldHp = pokemon.getHp();
			trainer.healPokemon(pokemon, item.getHp());
			difference = pokemon.getHp() - oldHp;
			return;
		}

		@Override
		public String getDescription() {
			if (difference != 0) 
				return trainer.getName() + " restaurou " + difference + " de hp com " + item.getName();
			else
				return pokemon.getName() + " já está com a vida cheia!";
		}
		
	}
	
	private class Attack extends Event { //classe interna que representa o evento de trocar o pokemon
		
		private static final int PRIORITY= 1; //menor prioridade comparado com os demais
		private Pokemon pokemon;
		private Pokemon pokemonOponent;
		private PokemonAttack pokemonAttack;
		
		Attack(long startTime, Pokemon pokemon, Trainer trainer, Trainer opponent) {
			super(startTime, PRIORITY);
			this.pokemon = trainer.getCurrentPokemon();
			this.pokemonOponent = opponent.getCurrentPokemon();
			this.pokemonAttack = pokemonAttack;
		} 

		@Override
		public void action() {
			trainer.setCurrentPokemon(this.trainer.indexOf(this.pokemon));
		}

		private String getEffectiveness() {
			switch (this.pokemon.getEffectivenessAgainst(this.pokemonOponent.)) {
			
			}
		}
		
		@Override
		public String getDescription() {
			return this.pokemon + "atacou com o ataque " + this.pokemonAttack.getName() + "! Foi";
		}
		
	}
	
	
	
}
