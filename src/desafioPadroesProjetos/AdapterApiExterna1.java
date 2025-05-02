package desafioPadroesProjetos;

public class AdapterApiExterna1 implements Pagamentos{

    ApiExternaPagamentos1 apiExternaPagamentos1;

    public AdapterApiExterna1(ApiExternaPagamentos1 apiExternaPagamentos1) {
        this.apiExternaPagamentos1 = apiExternaPagamentos1;
    }

    @Override
    public void pagar(String valor) {
        this.apiExternaPagamentos1.pagarViaApi1(valor);
    }
}
