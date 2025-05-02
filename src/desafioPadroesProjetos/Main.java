package desafioPadroesProjetos;

public class Main {
    public static void main(String[] args) {
        ApiExternaPagamentos1 apiExternaPagamentos1 = new ApiExternaPagamentos1();

        Pagamentos pagamentos1 = new AdapterApiExterna1(apiExternaPagamentos1);
        pagamentos1.pagar("15000");


        ApiExternaPagamentos2 apiExternaPagamentos2 = new ApiExternaPagamentos2();
        Pagamentos pagamentos2 = new AdapterApiExterna2(apiExternaPagamentos2);
        pagamentos2.pagar("2500");
    }
}
