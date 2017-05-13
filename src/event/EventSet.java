package event;

import java.util.ArrayList;
import java.util.List;

public class EventSet {

	private List<Event> events;

	public EventSet() {
		this.events = new ArrayList<Event>();
	}

	// insere um evento na lista na posicao correta,ou seja, apos os eventos
	// mais prioritarios, assim, a lista está sempre ordenada!
	public void push(Event event) {

		if (this.events.size() == 0) { // se nao ha eventos...
			this.events.add(event);
			return; // termina funcao
		}

		// se ha eventos...
		for (Event e : events) { // percorre a lista ate achar um evento menos
									// prioritario em relacao ao que sera
									// adicionado
			if (event.getPriority() > e.getPriority()) {
				this.events.add(this.events.indexOf(e), event); // insere na
																// posicao do
																// menos
																// prioritario e
																// desloca os
																// subsequentes
																// para o fim
				return; // termina funcao
			}
		}

		// se chegou aqui entao deve adicionar o evento no fim da lista
		this.events.add(event);
	}

	public Event getNext() { // retorna sempre o primeiro evento da lista, que
								// sera sempre o de maior prioridade
		return this.events.get(0);
	}

	public void removeCurrent() { // remove sempre o primeiro evento da lista,
									// deslocando os subsequentes para o comeco
		this.events.remove(0);
	}
}
