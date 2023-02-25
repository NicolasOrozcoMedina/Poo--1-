import java.util.Scanner;
public class Rdeuncirculo {
    public static void main(String[] args){;
        Double radio,area,longitud;
        Scanner x=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        radio=x.nextDouble();
        area=Math.PI*(Math.pow(radio,2));
        longitud=2*Math.PI*radio;
        System.out.println("El área del circulo es: "+area);
        System.out.println("La longitud del circulo es: "+longitud);
    }  
}
