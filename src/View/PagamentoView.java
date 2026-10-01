package View;

import Model.Pagamentos;

public class PagamentoView {
    public void exibirConfirmacao(Pagamentos pagamentos){
        System.out.println("Pagamento confirmado de: " + pagamentos.getValor());
    }
}
