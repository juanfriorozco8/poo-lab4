import java.util.Scanner;
import java.util.ArrayList;

public class DriverAutomovil {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ford Ranger_XL = new Ford(false, 0);

        System.out.println("Bienvenido al sistema de inicio del Ford XL");
        boolean continuar1 = true;
            while(continuar1){
                System.out.println("porfavor, presiona 1 si quieres encender el carro.");
                System.out.println("O presiona 2 para apagarlo o no encenderlo");
                int val1 = teclado.nextInt();
                switch(val1){
                    case 1:
                        Ranger_XL.setEstado(true);
                        System.out.println("El carro está encendido");
                        break;
                    case 2:
                        Ranger_XL.setEstado(false);
                        System.out.println("El carro está apagado");
                        break;
                    default:
                        System.out.println("Ingrese un numero correcto");
                        break;



                }
        }
    }
}