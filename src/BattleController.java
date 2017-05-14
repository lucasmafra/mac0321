import event.Event;
import event.EventController;
import pokemon.Effectiveness;
import pokemon.Pokemon;
import pokemon.PokemonAttack;
import trainer.Item;
import trainer.Trainer;

public class BattleController extends EventController {
	private Trainer[] competitors;
	private boolean isActive;

	BattleController(Trainer competitor1, Trainer competitor2) {
		super();
		this.competitors = new Trainer[]{competitor1, competitor2};
		this.isActive = true;
		addEvent(new SetTurn(System.currentTimeMillis()));
	}

	public Trainer[] getCompetitors() {
		return competitors;
	}

	public boolean isActive() {
		return isActive;
	}

	public Event getPlayerMove(Trainer player) {

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
		private static final int MAX_RAND = 255;
		private static final int MIN_RAND = 217;
		private Pokemon pokemon;
		private Trainer opponentTrainer;
		private PokemonAttack pokemonAttack;
		private int damage;
		private Effectiveness effectiveness;

		Attack(long startTime, Trainer trainer, Trainer opponent, PokemonAttack pokemonAttack) {
			super(startTime, PRIORITY);
			this.pokemon = trainer.getCurrentPokemon();
			this.opponentTrainer = opponent;
			this.pokemonAttack = pokemonAttack;

			int random = MIN_RAND + (int) (Math.random() + MAX_RAND);
			effectiveness = pokemon.getEffectivenessAgainst(opponent.getCurrentPokemonType());
			// Damage = ((2*Level/5 + 2)*Power*Attack/Defense/50 + 2) * Modifier
			damage = pokemonAttack.getBaseDamage() / 50 * effectiveness.getValue() / Effectiveness.NORMAL.getValue()
					* random / MAX_RAND;
		}

		@Override
		public void action() {
			opponentTrainer.damagePokemon(damage);
		}

		@Override
		public String getDescription() {
			return pokemon.getName() + " usou " + pokemonAttack.getName() + "!\n" + effectiveness.getDescription();
		}

		public int getAgility() {
			return pokemonAttack.getAgility();
		}
	}

	private class SetTurn extends Event {
		// It is executed after all the events from the previous turn are
		// executed.
		private Trainer playerOne;
		private Trainer playerTwo;
		private Event playerOneMove;
		private Event playerTwoMove;

		SetTurn(long startTime) {
			super(startTime);
			this.playerOne = getCompetitors()[0];
			this.playerTwo = getCompetitors()[1];
		}

		@Override
		public void action() {
			playerOneMove = getPlayerMove(playerOne);
			playerOneMove = getPlayerMove(playerOne);
			// Both players are attacking and player two attacks first.
			if (playerOneMove.getClass() == Attack.class && playerTwoMove.getClass() == Attack.class
					&& ((Attack) playerOneMove).getAgility() < ((Attack) playerTwoMove).getAgility()) {
				addEvent(playerTwoMove);
				addEvent(playerOneMove);
			} else {
				addEvent(playerOneMove);
				addEvent(playerTwoMove);
			}
		}

		@Override
		public String getDescription() {
			return "";
		}
	}

}
