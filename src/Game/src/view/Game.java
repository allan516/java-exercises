package view;

import model.Calcular;

import java.util.Scanner;

public class Game {
    static Scanner teclado = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calcular;

    public static void main(String[] args) {
        Game.jogar();
    }

    public static void jogar() {
        System.out.println("Informe o nível de dificuldade desejado [1, 2, 3, 4]: ");
        int dificuldade = Game.teclado.nextInt();

        Game.calcular = new Calcular(dificuldade);

        System.out.println("Informe o resultado para a seguinte operação: ");

        if (calcular.getOperacao() == 0) {
            System.out.println(calcular.getValor1() + " + " + calcular.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calcular.somar(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s). ");
            }
        } else if (calcular.getOperacao() == 1) {
            System.out.println(calcular.getValor1() + " - " + calcular.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calcular.diminuir(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s). ");
            }
        } else if (calcular.getOperacao() == 2) {
            System.out.println(calcular.getValor1() + " * " + calcular.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calcular.multiplicar(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s). ");
            }
        } else {
            System.out.println("A operação " + calcular.getOperacao() + " não é reconhecida.");
        }

        System.out.println("Deseja continuar? [1 - Sim, 0 - Não]");
        int continuar = Game.teclado.nextInt();

        if (continuar == 1) {
            Game.jogar();
        } else {
            System.out.println("Você fez " + Game.pontos + " ponto(s)");
            System.out.println("Até a próxima!");
            System.exit(0);
        }
    }
}
