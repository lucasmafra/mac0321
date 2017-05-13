package trainer;

public class Item {
	private String name;
	private int hp;

	public Item(String itemName, int healthPoints) {
		this.name = itemName;
		this.hp = healthPoints;
	}
	
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}
}
