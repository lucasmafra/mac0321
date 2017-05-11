package event;

import java.util.ArrayList;

public class EventSet {
	
	private ArrayList<Event> events;
	
	public void push(Event event) {
		
		if (this.events.size() == 0) { //se nao ha eventos...
			this.events.add(event);
			return; //termina funcao
		}
		
		//se ha eventos...
		for (Event e: events) { //percorre a lista ate achar um evento menos prioritario em relacao ao que sera adicionado
			if (event.getPriority() > e.getPriority()) { 
				events.add(events.indexOf(e), event); //insere na posicao do menos prioritario e os subsequentes para frente
				return; //termina funcao
			}
		}
		
		//se chegou aqui entao deve adicionar o evento no fim da lista
		this.events.add(event);
	}
	
	public Event getNext() { //retorna sempre o primeiro evento da lista, que sera sempre o de maior prioridade
		return this.events.get(0);
	}
	
	public void removeCurrent() {
		this.events.remove(0);
	}
}
