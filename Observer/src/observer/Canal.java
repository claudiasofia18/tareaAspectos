package observer;

import java.util.ArrayList;
import java.util.*;

public class Canal implements Subject{
	private List<Suscriptor> subs = new ArrayList<>();
	private String name;
	private boolean enVivo;
	
	public Canal(String name) {
		this.name = name;
		this.enVivo = false;
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
	public List<Suscriptor> upload(String title) {
		System.out.println("\nSe ha subido el video "+ title);
		return subs;
	}
	
	public int numSuscriptores (List<Suscriptor> subs) {
		return subs.size();
	}
}