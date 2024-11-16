import java.util.Scanner;
import java.util.ArrayList;

public class DriverAutomovil {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ford Ranger_XL = new Ford(false, 0);

        ArrayList<Cancion> playlist1 = new ArrayList<Cancion>();

        playlist1.add(new Cancion("Extasy", 3.34, "Myke Towers", "Urbano"));
        playlist1.add(new Cancion("Diosa", 3.50, "Myke Towers", "Urbano"));
        playlist1.add(new Cancion("Girl", 4.10, "Myke Towers", "Urbano"));

        ArrayList<Cancion> playlist2 = new ArrayList<>();
        playlist2.add(new Cancion("Blinding Lights", 3.20, "The Weeknd", "Pop"));
        playlist2.add(new Cancion("Starboy", 3.50, "The Weeknd", "Pop"));
        playlist2.add(new Cancion("Save Your Tears", 3.30, "The Weeknd", "Pop"));

        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    
        contactos.add(new Contacto("Carlos", 57183486, false));
        contactos.add(new Contacto("Andrea", 44123568, false));
        contactos.add(new Contacto("Juan", 55123456, false));
        contactos.add(new Contacto("Sofia", 32098765, false));
        contactos.add(new Contacto("Luis", 66003456, false));

        ArrayList<Double> emisorasFavoritas = new ArrayList<>();

        System.out.println("Bienvenido al sistema de inicio del Ford XL");
        boolean continuar1 = true;
            while(continuar1){
                System.out.println("porfavor, presiona 1 si quieres encender el carro.");
                System.out.println("O presiona 2 para apagarlo o no encenderlo");
                System.out.println("Presiona 3 para que te tire afuera del carro :D");
                int val1 = teclado.nextInt();
                switch (val1) {
                    case 1:
                        Ranger_XL.setEstado(true);
                        System.out.println("El carro está encendido.");
                        boolean continuarModo = true;
    
                        while (continuarModo) {
                            System.out.println("\n¿Qué desea hacer?");
                            System.out.println("1. Modo Radio");
                            System.out.println("2. Modo Reproducción");
                            System.out.println("3. Modo Teléfono");
                            System.out.println("4. Modo Productividad");
                            System.out.println("5. Regresar");
                            int val2 = teclado.nextInt();
    
                            switch (val2) {
                                case 1:
                                    System.out.println("Está en modo Radio.");
                                    System.out.println("1. Cambiar entre AM/FM");
                                    System.out.println("2. Cambiar emisoras");
                                    System.out.println("3. Guardar emisora favorita");
                                    System.out.println("4. Cargar emisoras favoritas");
                                    int radioOption = teclado.nextInt();
                                    switch (radioOption) {
                                        case 1:
                                            System.out.println("Cambiando entre AM y FM.");
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la nueva frecuencia (en incrementos de 0.5):");
                                            double nuevaFrecuencia = teclado.nextDouble();
                                            System.out.println("Sintonizado a: " + nuevaFrecuencia + " MHz.");
                                            break;
                                        case 3:
                                            System.out.println("Ingrese la frecuencia para guardar como favorita:");
                                            double frecuenciaFavorita = teclado.nextDouble();
                                            emisorasFavoritas.add(frecuenciaFavorita);
                                            System.out.println("Guardado: " + frecuenciaFavorita + " MHz.");
                                            break;
                                        case 4:
                                            System.out.println("Emisoras favoritas:");
                                            for (double emisora : emisorasFavoritas) {
                                                System.out.println(emisora + " MHz");
                                            }
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Modo Reproducción.");
                                    System.out.println("1. Seleccionar playlist");
                                    System.out.println("2. Cambiar canción");
                                    System.out.println("3. Reproducir canción");
                                    int playbackOption = teclado.nextInt();
                                    switch (playbackOption) {
                                        case 1:
                                            System.out.println("1. Playlist 1");
                                            System.out.println("2. Playlist 2");
                                            int playlistChoice = teclado.nextInt();
                                            System.out.println("Playlist seleccionada: " + (playlistChoice == 1 ? "Playlist 1" : "Playlist 2"));
                                            break;
                                        case 2:
                                            System.out.println("Cambiando a la siguiente canción...");
                                            break;
                                        case 3:
                                            System.out.println("Reproduciendo...");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("Modo Teléfono.");
                                    System.out.println("1. Conectar/Desconectar teléfono");
                                    System.out.println("2. Mostrar contactos");
                                    System.out.println("3. Llamar a contacto");
                                    System.out.println("4. Modo espera");
                                    int phoneOption = teclado.nextInt();
                                    switch (phoneOption) {
                                        case 1:
                                            System.out.println("Teléfono conectado.");
                                            break;
                                        case 2:
                                            for (Contacto contacto : contactos) {
                                                System.out.println(contacto.getNombre());
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Llamando...");
                                            break;
                                        case 4:
                                            Ranger_XL.ModoEspera();
                                            break;
                                    }
                                    break;
                                case 4:
                                    System.out.println("Modo Productividad.");
                                    System.out.println(Ranger_XL.VerPronostico());
                                    break;
                                case 5:
                                    continuarModo = false;
                                    break;
                            }
                        }
                        break;
                    case 2:
                        Ranger_XL.setEstado(false);
                        System.out.println("El carro está apagado");
                        break;
                    case 3:
                        System.out.println("Chau");
                        continuar1 = false;
                        break;
                    default:
                        System.out.println("Ingrese un numero correcto");
                        break;

                }
        }
    }
}