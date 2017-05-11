package event;

public abstract class Event {
	private long startTime;
	private int priority; //prioridade do evento em ordem crescente (prioridade 1 < prioridade 2...) default = 1;
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
	
	public boolean isReady() {
		return System.currentTimeMillis() >= this.startTime;
	}
	
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
	
}
