package View;

import Model.CartaoCredito;

public class CartaoCreditoView {
    public void exebirConfirmacao(CartaoCredito cartaoCredito, double valorDaCompra){
        if (cartaoCredito.realizarCompra(valorDaCompra)) {
            System.out.println("Sua compra foi autorizado com sucesso");
        } else {
            System.out.println("Não autorizado, limite insuficiente!");
        }

    }
}
