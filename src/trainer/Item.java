package trainer;

public class Item {
	private String name;
	private int healPower;
	public int getHealPower() {
		return healPower;
	}
	public void setHealPower(int healPower) {
		this.healPower = healPower;
	}
	public Item(String itemName, int healPower) {
		this.name = itemName;
		this.healPower = healPower;
	}
}
