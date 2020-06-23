package observer;

public class Suscriptor implements Observer {
	private String name;
	private Canal canal = new Canal();
	
	
	
	
	public Suscriptor(String name) {
		super();
		this.name = name;
	}




	/* (non-Javadoc)
	 * @see observer.Observer#update()
	 */
	@Override
	public void update() {
		
		System.out.println("Hey"+ name +"Nuevo Video: "+ canal.title);
	}
	
	/* (non-Javadoc)
	 * @see observer.Observer#canalsuscrito(observer.Canal)
	 */
	@Override
	public void canalsuscrito(Canal cn) {
		canal=cn;
	}

}
