package event;

public abstract class Event {
	private long startTime;
	private int priority; //representa prioridade do evento; 1 = prioridade padrao;
	private boolean isReady;
	abstract void action();
	abstract String getDescription();
	
	Event(long startTime, int priority) {
		this.startTime = startTime;
		if (priority < 1) { //evita valores insconsistentes de prioridade
			priority = 1;
		}
		this.priority = priority;
	}
	
	Event(long startTime) {
		this(startTime, 1);
	}
	
	
	
}
