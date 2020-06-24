import java.util.InputMismatchException;
import java.util.Scanner;
import observer.*;

public class Main {
	private static Canal cn;
	
    public static void main(String[] args) {
    	Ventana v1= new Ventana();
		v1.setVisible(true);
        init();
        menu();
    }
        public static void init() {
        cn = new Canal("HOLASOYTYRONECOMUNICA");
        Suscriptor s1 = new Suscriptor("Tyrone");
        Suscriptor s2 = new Suscriptor("Tommy");
        Suscriptor s3 = new Suscriptor("Bryan");
        Suscriptor s4 = new Suscriptor("Claudia");
        Suscriptor s5 = new Suscriptor("Rafael");
        s1.canalsuscrito(cn);
        s2.canalsuscrito(cn);
        s3.canalsuscrito(cn);
        s4.canalsuscrito(cn);
        s5.canalsuscrito(cn);
        }
        
        public static void menu() {
        	Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion; 
        	while (!salir) {
                System.out.println("\n1. Subir video");
                System.out.println("2. En vivo");
                System.out.println("3. Numero de Suscriptores");
                System.out.println("4. Salir");
                try {
                    System.out.println("\nElegir una opcion");
                    opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                        	System.out.println("\nIngrese titulo del video");
                        	String titulo = sn.next();
                        	cn.upload(titulo);
                            break;
                        case 2:
                        	cn.setEnVivo(true);
                            break;
                        case 3:
                        	cn.numSuscriptores(cn.getSubs());
                            break;
                        case 4:
                            salir = true;
                            break;
                        default:
                            System.out.println("N�meros entre 1 y 3");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un n�mero");
                    sn.next();
                }
            }
        }
        
 
    }
 
