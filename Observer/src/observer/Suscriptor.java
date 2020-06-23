package observer;

public class Suscriptor implements Observer {
	private String name;
	private Canal canal;	
	
	public Suscriptor(String name) {
		this.name = name;
		this.canal = null;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void update() {
		
	}
	
	@Override
	public Canal canalsuscrito(Canal cn) {
		canal=cn;
		return cn;
	}

}
