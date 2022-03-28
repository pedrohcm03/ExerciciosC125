import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        // Criando objeto tipo Scanner para ler do teclado
        Scanner entrada = new Scanner(System.in);

        // Declarando as variáveis
        int NPA, NP3;

        // Entrando com o valor da variável NPA
        System.out.print("Digite a NPA: ");
        NPA = entrada.nextInt();

        // Determinando se o aluno passou ou não
        if(NPA >= 60 ){
            System.out.println("Aprovado!");
        }else{
            System.out.print("Digite a NP3: ");
            NP3 = entrada.nextInt();

            if((NP3 + NPA)/2 >= 50){
                System.out.println("Aprovado!");
            }else{
                System.out.println("Reprovado!");
            }
        }

        entrada.close();
    }
}