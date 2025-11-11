import java.util.Scanner;
import java.util.Random;

public class exercici8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println(" JUEGO: PIEDRA, PAPEL O TIJERA ");
        System.out.println("===================================");
        String[] opciones = { "piedra", "papel", "tijera" };

        System.out.println("Elige entre: Piedra, Papel, Tijera.");
        String eleccionJugador = sc.nextLine();
        if (!eleccionJugador.equalsIgnoreCase("piedra") && !eleccionJugador.equalsIgnoreCase("papel")
                && !eleccionJugador.equalsIgnoreCase("tijera")) {
            System.out.println("Error, tienes que elegir entre Piedra, Papel o Tijera");
            System.out.println("=====================================================");
            sc.close();
return;
        }
        

        System.out.println("Has elegido: " + eleccionJugador);

        int indiceOpciones = rd.nextInt(3);
        String eleccionMaquina = opciones[indiceOpciones];
        System.out.println("La máquina ha elegido: " + eleccionMaquina);
        
        if (eleccionJugador.equalsIgnoreCase(eleccionMaquina)) {
            System.out.println("Empate.");}

            else if ((eleccionJugador.equalsIgnoreCase("piedra") && eleccionMaquina.equalsIgnoreCase("tijera")) ||
             (eleccionJugador.equalsIgnoreCase("papel") && eleccionMaquina.equalsIgnoreCase("tijera")) ||  (eleccionJugador.equalsIgnoreCase("papel") && eleccionMaquina.equalsIgnoreCase("piedra"))) {
                System.out.println("Has ganado");}
            
            

            else {System.out.println("Has perdido");}

            sc.close();
             }
            
        }

