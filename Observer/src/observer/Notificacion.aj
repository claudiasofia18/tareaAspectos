import java.util.List;
import observer.*;

public aspect Notificacion {
	after() returning(List<Suscriptor> subs): execution(List<Suscriptor> upload(String)) {
		for(int i = 0;i<subs.size();i++) {
			System.out.println("Se ha subido un nuevo video!!! Miralo ya!! "+ subs.get(i).getName());	
		}			
	}
	
	after() : execution(void setEnVivo(boolean)){
		System.out.println("Se ha comenzado un directo!!!");
	}
	
	after() returning(Canal cn): execution(Canal canalsuscrito(Canal)){
		System.out.println("Te has suscrito a " + cn.getNameChannel());
	}
		
	
	
}
