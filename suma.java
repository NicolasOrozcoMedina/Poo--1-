import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        Double suma, X,Y;
        suma=0.0;
        Scanner X1 = new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        X=X1.nextDouble();
        Scanner Y2 = new Scanner(System.in);
        System.out.print("Ingrese el valor de y: ");
        Y=Y2.nextDouble(); 
        suma=suma+X;
        X= (X+Math.pow(Y,2));
        suma=suma+X/Y; 
        System.out.println("El valor de la suma es " + suma);
    }
}

