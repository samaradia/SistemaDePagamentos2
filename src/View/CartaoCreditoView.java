package View;

import Model.CartaoCredito;

public class CartaoCreditoView {
    public void exibirAutorizacao(CartaoCredito cartaoCredito, double valorDaCompra){
        if (cartaoCredito.realizarCompra(valorDaCompra)) {
            System.out.println("Sua compra foi autorizado com sucesso");
        } else {
            System.out.println("Não autorizado, limite insuficiente!");
        }

    }
    public void exibirConfirmacao(CartaoCredito cartaoCredito){
        System.out.printf("Pagamento confirmado no Cartão de Crédito." +
                "O valor final ficou de: "+ cartaoCredito.valorFinal());
    }
}
