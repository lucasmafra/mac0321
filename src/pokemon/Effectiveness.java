package pokemon;

public enum Effectiveness {
	NO_EFFECT(0, " Não teve efeito."), NOT_VERY_EFFECTIVE(50, " Não foi muito efetivo."), NORMAL(100,
			""), SUPER_EFFECTIVE(200, " Foi super-efetivo!");

	private int value;
	private String description;

	Effectiveness(int percentage, String description) {
		this.value = percentage;
		this.description = description;
	}

	public int getValue() {
		return value;
	}
	
	public String getDescription() {
		return description;
	}
}
