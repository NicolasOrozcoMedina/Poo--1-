import java.util.Scanner;
public class Salariobruto {
    public static void main(String[] args) {
        double salario_neto, salario_bruto, retencion, horas,valor, fuente;
        Scanner x= new Scanner(System.in);
        System.out.println("Ingrese las horas que se trabaja:");
        horas=x.nextDouble();
        System.out.println("Ingrese el valor por hora:");
        valor=x.nextDouble();
        System.out.println("Ingrese la rentencion de fuente:");
        fuente=x.nextDouble();
        salario_bruto=valor*horas;
        retencion=salario_bruto*fuente;
        salario_neto=salario_bruto-retencion;
        System.out.println("El salario bruto es " +salario_bruto);
        System.out.println("La retencion es en la fuente es "+retencion);
        System.out.println("El salario neto es "+ salario_neto);
        }  
    }    
