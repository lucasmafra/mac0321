import event.Event;
import event.EventController;
import pokemon.Pokemon;
import pokemon.PokemonAttack;
import trainer.Item;
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
			return this.trainer.getName() + " fugiu da batalha!";
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
	
	private class UseItem extends Event { //classe interna que representa o evento de trocar o pokemon
		
		private static final int PRIORITY= 2;
		private Pokemon pokemon;
		private Trainer trainer;
		private Item item;
		
		UseItem(long startTime, Pokemon pokemon, Trainer trainer, Item item) {
			super(startTime, PRIORITY);
			this.pokemon = pokemon;
			this.trainer = trainer;
			this.item = item;
		} 
		
		int getRestoredHp() {
			if (this.pokemon.getHp() + this.item.getHealPower() <= this.pokemon.getMaxHp()) //nao pode restaurar para mais do que 100%
				return this.pokemon.getHp() + this.item.getHealPower();
			
			return this.pokemon.getMaxHp();
		}

		@Override
		public void action() {
			this.pokemon.setHp(this.item.getHealPower());
		}

		@Override
		public String getDescription() {
			return this.trainer.getName() + " restaurou " + this.pokemon + " com " + String.valueOf(this.getRestoredHp());
		}
		
	}
	
	private class Attack extends Event { //classe interna que representa o evento de trocar o pokemon
		
		private static final int PRIORITY= 1; //menor prioridade comparado com os demais
		private Pokemon pokemon;
		private Pokemon pokemonOponent;
		private PokemonAttack pokemonAttack;
		
		Attack(long startTime, Pokemon pokemon, Pokemon pokemonOponent, PokemonAttack pokemonAttack) {
			super(startTime, PRIORITY);
			this.pokemon = pokemon;
			this.pokemonOponent = pokemonOponent;
			this.pokemonAttack = pokemonAttack;
		} 

		@Override
		public void action() {
			this.trainer.setCurrentPokemon(this.trainer.indexOf(this.pokemon));
		}

		private String getEffectiveness() {
			switch (this.pokemon.getEffectivenessAgainst(this.pokemonOponent.)) {
			
			}
		}
		
		@Override
		public String getDescription() {
			return this.pokemon + "atacou com o ataque " + this.pokemonAttack.getName()"! Foi"
		}
		
	}
	
	
	
}
