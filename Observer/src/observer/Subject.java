package observer;

import java.util.List;

public interface Subject {

	List<Suscriptor> upload(String title);
	
	void setEnVivo(boolean enVivo);
	
}