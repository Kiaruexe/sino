package tema7.actividad76;

import java.util.Scanner;

public class main {
    public static void main(String [] args) {

        Scanner leer =new Scanner(System.in);

        System.out.println("si");
        int veces = leer.nextInt();



        hora hora = new hora(35,23,56);

        hora.mostar();
        hora.sumar(veces);
        hora.mostar();




    }
    }
