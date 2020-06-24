import java.util.InputMismatchException;
import java.util.Scanner;
import observer.*;

public class Main {
	private static Canal cn;
	
    public static void main(String[] args) {
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
                System.out.println("3. Salir");
                try {
                    System.out.println("\nEscribe una de las opciones");
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
                            salir = true;
                            break;
                        default:
                            System.out.println("Números entre 1 y 3");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                }
            }
        }
        
 
    }
 
