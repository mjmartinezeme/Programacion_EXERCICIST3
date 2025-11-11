import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("🎮 JUEGO: PIEDRA, PAPEL O TIJERA 🎮");
        System.out.println("===================================");
        
        // Opciones del juego
        String[] opciones = {"piedra", "papel", "tijera"};
        
        // Elección del jugador
        System.out.println("Elige: piedra, papel o tijera");
        System.out.print("Tu elección: ");
        String jugador = sc.nextLine().toLowerCase();
        
        // Validar entrada del jugador
        if (!jugador.equals("piedra") && !jugador.equals("papel") && !jugador.equals("tijera")) {
            System.out.println("❌ Error: Debes elegir piedra, papel o tijera");
            sc.close();
            return;
        }
        
        // Elección de la computadora (aleatoria)
        int indiceComputadora = random.nextInt(3); // 0, 1 o 2
        String computadora = opciones[indiceComputadora];
        
        System.out.println("🤖 La computadora eligió: " + computadora);
        
        // Determinar el ganador
        System.out.println("\n--- RESULTADO ---");
        
        if (jugador.equals(computadora)) {
            System.out.println("EMPATE! 🤝");
        } else if (
            (jugador.equals("piedra") && computadora.equals("tijera")) ||
            (jugador.equals("papel") && computadora.equals("piedra")) ||
            (jugador.equals("tijera") && computadora.equals("papel"))
        ) {
            System.out.println("🎉 ¡GANASTE! 🎉");
        } else {
            System.out.println("💻 ¡La computadora gana! 💻");
        }
        
        sc.close();
    }
}
