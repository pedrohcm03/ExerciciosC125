import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        // Criando objeto tipo Scanner para ler o teclado
        Scanner entrada = new Scanner(System.in);

        // Declarando a variável
        int numero;

        // Entrando com o numero de alunos
        System.out.print("Digite o numero de alunos: ");
        numero = entrada.nextInt();

        // Determinando a sala
        switch (numero){
            case 10:
            case 20:
                System.out.println("Sala I-15");
            break;
            case 30:
                System.out.println("Sala I-22");
            break;
            default:
                System.out.println("Sala não encontrada");
                break;
        }

        entrada.close();
    }
}
