import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){

        // Criando objeto tipo Scanner para ler no teclado
        Scanner entrada = new Scanner(System.in);

        // Declarando as variáveis
        int num;

        // Gerando numero entre 1 e 10
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        do {
            System.out.print("Digite o número gerado: ");
            num = entrada.nextInt();

            if(num > x){
                System.out.println("Numero maior do que o gerado!");
            }else if(num < x){
                System.out.println("Numero menor do que o gerado!");
            }
        }while (num != x);

        System.out.println("Acertou!");

        // Fechando Scanner
        entrada.close();
    }
}