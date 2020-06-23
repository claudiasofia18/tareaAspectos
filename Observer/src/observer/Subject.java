package observer;

public interface Subject {

	void suscrito(Suscriptor sub);

	void unSuscrito(Observer sub);

	void notificacion();

	void upload(String title);

}