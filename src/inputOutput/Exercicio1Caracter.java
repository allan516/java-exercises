package inputOutput;

import javax.sound.sampled.Line;
import java.io.*;

public class Exercicio1Caracter {

    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }
    public static void receberTecladoImprimirConsole() throws IOException {
        /*InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);*/

        System.out.println("Recomende 3 filmes: ");
        //utilizando padrão decorator
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        br.readLine();

        /*OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw); */

        //Padrão decorator (mais usual):

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!line.isEmpty());
            bw.flush();

            br.close();
            bw.close();
    }


}
