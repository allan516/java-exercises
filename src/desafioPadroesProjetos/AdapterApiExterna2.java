package desafioPadroesProjetos;

public class AdapterApiExterna2 implements Pagamentos{
    ApiExternaPagamentos2 apiExternaPagamentos2;

    public AdapterApiExterna2(ApiExternaPagamentos2 apiExternaPagamentos2) {
        this.apiExternaPagamentos2 = apiExternaPagamentos2;
    }

    @Override
    public void pagar(String valor) {
        this.apiExternaPagamentos2.pagarViaApi2(valor);
    }
}
