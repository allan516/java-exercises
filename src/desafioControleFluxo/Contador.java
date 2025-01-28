package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");

        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException err ) {
            System.out.println("Erro: " + err.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm < parametroDois) {

            int contagem = parametroDois - parametroUm;
            for (int numero = 0; numero < contagem; numero++) {
                System.out.println("Imprimindo o número " + (numero + 1));
            }
        } else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
}
