public class ejemploWhileBasico {
    public static void main(String[] args) {

        System.out.println("=== WHILE básico: contar del 1 al 5 ===");
        int j = 1; // inicialización antes del while
        while (j <= 5) { // se evalúa ANTES de entrar al bloque
            System.out.println("WHILE -> j = " + j);
            j++; // actualización dentro del bloque
        }
        System.out.println();
    }
}