import java.util.Scanner;
public class exercici1b {
    public static void main(String[] args) {
    
        Scanner lado=new Scanner(System.in);
        System.out.println("Introdueix el valor del costat");
        int numero = lado.nextInt();
        int area = (numero*numero);
        int perimetro =(numero*4);
    System.out.println("L'area del quadrat es: " + area);
    System.out.println("El perímetre del quadrat es: " + perimetro);
    lado.close();
    }
}