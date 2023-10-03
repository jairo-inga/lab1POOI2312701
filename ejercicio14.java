package semana03POOI;
import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduzca un número para hallar el día de la semana: ");
        int n = sc.nextInt();

        
        String diaSemana;
        switch (n) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número inválido, ingrese un número del 1 al 7.";
                break;
        }

        
        System.out.println("Día de la semana: " + diaSemana);
    }
}
// Ejecuta correctamente
