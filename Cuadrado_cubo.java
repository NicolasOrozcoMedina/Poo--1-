import java.util.Scanner;
public class Cuadrado_cubo {
    public static void main(String[] args) {
        Double a,b;
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        a=x.nextDouble();
        b=a;
        a=Math.pow(a,2);
        b=Math.pow(b,3);
        System.out.println("El cuadrado del número es: "+a);
        System.out.println("El cubo del número es: "+b);  
    }  
}
