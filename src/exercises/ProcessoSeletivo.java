package exercises;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
//        System.out.println("Processo seletivo aberto");
//        analisarCandidato((1900.0));
//        analisarCandidato((2200.0));
//        analisarCandidato((2000.0));

        //selecaoCandidatos();

        //imprimirSelecionados();

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        for(String candidato: candidatos){
            entrarEmContato(candidato);
        }

    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÙMERO MÁXIMO DE TENTATIVAS " +  tentativasRealizadas + " REALIZADA.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length ) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static  void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        for(String candidato: candidatos) {
            System.out.println(" O candidato selecionado foi: " + candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println( "LIGAR PARA O CANDIDATO");
                    } else if (salarioBase < salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPÓSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
