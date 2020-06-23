package observer;

public class Suscriptor implements Observer {
	private String name;
	private Canal canal;	
	
	public Suscriptor(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
	}
	
	@Override
	public void canalsuscrito(Canal cn) {
		canal=cn;
	}

}
