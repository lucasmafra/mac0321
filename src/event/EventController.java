package event;

public class EventController {

	private EventSet eventSet;

	public EventController() {
		this.eventSet = new EventSet();
	}

	public void addEvent(Event event) {
		this.eventSet.push(event);
	}

	public void executeEvents() {
		Event e;

		while ((e = eventSet.getNext()) != null) {// enquanto houver eventos a
													// serem executados
			if (e.isReady()) {
				e.action();
				System.out.println(e.getDescription());
				this.eventSet.removeCurrent();
			}
		}
	}
}
