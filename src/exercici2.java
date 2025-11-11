import java.util.Scanner;
public class exercici2 {
    public static void main(String[]args){
        Scanner numero1=new Scanner(System.in);
        System.out.println("Introdueix el primer número");
        int a= numero1.nextInt();
        System.out.println("Introdueix el segon número");
        int b= numero1.nextInt();
        int suma = (a+b);
        int resta =(a-b);
        int producte = (a*b);
    System.out.println("La suma dels numeros es " + suma);
    System.out.println("La resta dels numeros es " + resta);
    System.out.println("La multiplicació dels numeros es " + producte);
            if (b!=0) {
                double divisio= (double) a/b;
                System.out.println("La divisió dels numeros es " + divisio);
            } else{
                System.out.println("No es pot dividir per 0");
        
            }    
            numero1.close();
    }
}
