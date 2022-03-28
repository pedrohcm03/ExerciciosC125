import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int part1, part2, part3;

        System.out.print("Digite o numero de zumbis mortos na partida 1: ");
        part1 = entrada.nextInt();
        System.out.print("Digite o numero de zumbis mortos na partida 2: ");
        part2 = entrada.nextInt();
        System.out.print("Digite o numero de zumbis mortos na partida 3: ");
        part3 = entrada.nextInt();

        int total = part1 + part2 + part3;
        int media = total/3;

        System.out.println("Total de zumbis mortos: " + total);
        System.out.println("Media de zumbis mortos: " + media);

        entrada.close();
    }
}
