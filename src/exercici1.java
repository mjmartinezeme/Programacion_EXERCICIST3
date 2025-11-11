import java.util.Scanner;
public class exercici1 {
    public static void main(String[] args) {
    
        Scanner lado=new Scanner(System.in);
        System.out.println("Introdueix el valor del costat");
        int numero = lado.nextInt();
        int area = (numero*numero);
    System.out.println("L'area del cuadrat es: " + area);
    lado.close();
    }
}
