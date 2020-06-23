import java.util.InputMismatchException;
import java.util.Scanner;
import observer.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        Suscriptor s1 = new Suscriptor("Tyrone");
        Suscriptor s2 = new Suscriptor("Tommy");
        Suscriptor s3 = new Suscriptor("Bryan");
        Suscriptor s4 = new Suscriptor("Claudia");
        Suscriptor s5 = new Suscriptor("Rafael");
        Canal cn = new Canal("HOLASOYTYRONECOMUNICA");
        s1.canalsuscrito(cn);
        s2.canalsuscrito(cn);
        s3.canalsuscrito(cn);
        s4.canalsuscrito(cn);
        s5.canalsuscrito(cn);
        
        while (!salir) {
            System.out.println("1. Subir video");
            System.out.println("2. En vivo");
            System.out.println("3. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
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
                        System.out.println("N�meros entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un n�mero");
                sn.next();
            }
        }
 
    }
 
}