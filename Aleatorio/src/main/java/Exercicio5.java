import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        // Criando objeto tipo Scanner para ler no teclado
        Scanner entrada = new Scanner(System.in);

        // Declarando a variável
        int num;

        // Gerando numero entre 1 e 10
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        do {
            System.out.print("Digite o número gerado: ");
            num = entrada.nextInt();
            if(num != x) {
                System.out.println("Errou!");

            }
        }while (num != x);

        System.out.println("Acertou!");

        // Fechando Scanner
        entrada.close();
    }
}
