import java.util.List;
import observer.*;

public aspect Notificacion {
	after() returning(List<Suscriptor> subs): execution(List<Suscriptor> upload(String)) {
		for(int i = 0;i<subs.size();i++) {
			System.out.println("Se ha subido un nuevo video!!!"+ subs.get(i).getName()+" Miralo ya!! ");	
		}			
	}
	
	after() : execution(void setEnVivo(boolean)){
		System.out.println("Se ha comenzado un directo!!!");
	}
	
	after() returning(Canal cn): execution(Canal canalsuscrito(Canal)){
		System.out.println("Te has suscrito a " + cn.getNameChannel());
	}
		
	
	//Implementacion de nueva funcionalidad.
	pointcut numSuss(): call( int numSuscriptores (List<Suscriptor> ));
	after() returning(int nunSus):numSuss(){
		System.out.println("Felicidades!!!!!! su canala cuenta con "+nunSus+" suscriptores");
		
	}
	
}
