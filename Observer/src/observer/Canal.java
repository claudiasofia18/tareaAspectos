package observer;

import java.util.ArrayList;
import java.util.*;

public class Canal implements Subject{
	private List<Suscriptor> subs = new ArrayList<>();
	String title;
	
	/* (non-Javadoc)
	 * @see observer.Subject#suscrito(observer.Suscriptor)
	 */
	@Override
	public void suscrito(Suscriptor sub) {
		subs.add(sub);
		
}
	
	/* (non-Javadoc)
	 * @see observer.Subject#unSuscrito(observer.Observer)
	 */
	@Override
	public void unSuscrito(Observer sub) {
		
		subs.remove(sub);
		
		
	}
	
	/* (non-Javadoc)
	 * @see observer.Subject#notificacion()
	 */
	@Override
	public void notificacion() {
		for(Observer sub: subs) {
					sub.update();
	}
		}
	/* (non-Javadoc)
	 * @see observer.Subject#upload(java.lang.String)
	 */
	@Override
	public void upload(String title) {
		this.title = title;
		notificacion();
	}
}