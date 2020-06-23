package observer;

import java.util.ArrayList;
import java.util.*;

public class Canal implements Subject{
	private List<Suscriptor> subs = new ArrayList<>();
	private String name;
	private boolean enVivo;
	
	public Canal(String name) {
		this.name = name;
		enVivo = false;
	}
	
	//GETTERS Y SETTERS
	public String getNameChannel() {
		return name;
	}
	
	public List<Suscriptor> getSubs(){
		return subs;
	}
	
	public void setSubs(List<Suscriptor> subs) {
		this.subs = subs;
	}
	
	//OBSERVABLES
	@Override
	public void setEnVivo(boolean enVivo) {
		this.enVivo = enVivo;
	}

	@Override
	public String upload(String title) {
		return title;
	}
}