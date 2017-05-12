package pokemon;

public enum Effectiveness {
	NO_EFFECT(0), NOT_VERY_EFFECTIVE(50), NORMAL(100), SUPER_EFFECTIVE(200);

	int value;

	Effectiveness(int percentage) {
		this.value = percentage;
	}

	public int getValue() {
		return value;
	}
}
