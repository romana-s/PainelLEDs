package projetoleds;

import java.util.Scanner;

public class ProjetoLEDs {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int c, a, leds;

        System.out.println("Digite o comprimento em centimetros: ");
        c = entrada.nextInt();
        System.out.println("Digite a altura em centimetros: ");
        a = entrada.nextInt();

        leds = (1 + a) * (1 + c);
        System.out.println("A quantidade total de Leds necessarios e: " + leds);

    }

}
