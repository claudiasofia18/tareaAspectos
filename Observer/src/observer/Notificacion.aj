import java.util.List;

public aspect Notificacion {
	after() returning(List<Suscriptor> subs): execution(upload(String title)){
		for(int i = 0;i<subs.size();i++) {
			System.out.println("Se ha subido un nuevo video!!! Miralo ya!! "+ subs.get(i).getName());	
		}		
		
	}
	after() : execution(setEnVivo(bolean valor)){
		System.out.println("Se ha comenzado un directo!!!");
	}
	after() returning(Canal cn): execution(canalSsucrito(Canal cn)){
		System.out.println("Te has suscrito a "+cn.getNameChannel());
		
	}
		
	
	
}
