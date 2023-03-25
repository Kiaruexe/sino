package tema8.tema81;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        hora horas = new hora(0,0);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la hora");
        horas.sethora(leer.nextInt());

        System.out.println("Ingrese la minutos");
        horas.setminutos(leer.nextInt());
        horas.mostrar();
        horas.masminutos();
        horas.mostrar();

    }
}
