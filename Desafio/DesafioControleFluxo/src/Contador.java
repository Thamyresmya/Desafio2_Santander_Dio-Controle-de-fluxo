import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("----BEM VINDO AO DESAFIO - CONTROLE DE FLUXO---");

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem de exceção
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        System.out.println("");
        System.out.println("----FIM DO FLUXO---");
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
        //validação se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        //For para imprimir os números com base na variável contagem
        System.out.println("IMPRESSÃO DOS NÚMEROS:");
        System.out.println("");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}