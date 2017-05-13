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

	// classe interna que representa o evento de fugir da batalha
	private class RunAway extends Event {

		private static final int PRIORITY = 4;
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

	// classe interna que representa o evento de trocar o pokemon
	private class SwitchPokemon extends Event {

		private static final int PRIORITY = 3;
		private int nextPokemonIndex;
		private Pokemon nextPokemon;
		private Trainer trainer;

		SwitchPokemon(long startTime, int pokemonIndex, Trainer trainer) {
			super(startTime, PRIORITY);
			this.trainer = trainer;
			nextPokemonIndex = pokemonIndex;
			this.nextPokemon = trainer.getPokemons()[pokemonIndex];
		}

		@Override
		public void action() {
			// if the index is valid
			if (nextPokemonIndex != trainer.getCurrentPokemonIndex() && nextPokemonIndex >= 0
					&& nextPokemonIndex < trainer.getNumberOfPokemons())
				trainer.setCurrentPokemon(nextPokemonIndex);
		}

		@Override
		public String getDescription() {
			return trainer.getName() + " trocou para o pokemon " + nextPokemon.getName();
		}

	}

	// classe interna que representa o evento de usar um item
	private class UseItem extends Event {

		private static final int PRIORITY = 2;
		private int pokemonIndex;
		private Pokemon pokemon;
		private Trainer trainer;
		private Item item;
		private int difference;

		UseItem(long startTime, int pokemonIndex, Trainer trainer, Item item) {
			super(startTime, PRIORITY);
			this.pokemonIndex = pokemonIndex;
			this.pokemon = trainer.getPokemons()[pokemonIndex];
			this.trainer = trainer;
			this.item = item;
		}

		@Override
		public void action() {
			int oldHp = pokemon.getHp();
			trainer.healPokemon(pokemonIndex, item.getHp());
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

	// classe interna que representa o evento de trocar o pokemon
	private class Attack extends Event {

		private static final int PRIORITY = 1;
		private Trainer trainer;
		private Pokemon pokemon;
		private Trainer opponentTrainer;
		private Pokemon opponentPokemon;
		private PokemonAttack pokemonAttack;
		private int damage;
		private int effectiveness;

		Attack(long startTime, Trainer trainer, Trainer opponent, PokemonAttack pokemonAttack) {
			super(startTime, PRIORITY);
			this.trainer = trainer;
			this.pokemon = trainer.getCurrentPokemon();
			this.opponentTrainer = opponent;
			this.opponentPokemon = opponentTrainer.getCurrentPokemon();
			this.pokemonAttack = pokemonAttack;
			
			effectiveness = pokemon.getEffectivenessAgainst(opponentPokemon.getType());
			damage = pokemonAttack.getBaseDamage() * effectiveness;
		}

		@Override
		public void action() {
			opponentTrainer.damagePokemon(damage);
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
