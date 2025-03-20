package inputOutput;

import java.io.*;
import java.util.Scanner;

public class Exercicio2Caracter {
    public static void main(String[] args) throws IOException {
        lerTecladoEcreverDoc();
    }

    public static void lerTecladoEcreverDoc() throws IOException {

        //escrevendo no console
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        //abrindo o teclado
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        //referência ao doc
        File f = new File("recomendacoes.txt");


        //escrevendo no doc
        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {

            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scan.nextLine();

        } while (!line.equalsIgnoreCase("fim"));

        pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());

        pw.close();
        scan.close();
        bw.close();
    }

}
