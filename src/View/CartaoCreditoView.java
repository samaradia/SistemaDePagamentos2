package View;

import Model.CartaoCredito;

public class CartaoCreditoView {
    public void exibirAutorizacao(boolean autorizcao){
        if (autorizcao) {
            System.out.println("Sua compra foi autorizado com sucesso.");
        } else {
            System.out.println("Não autorizado, limite insuficiente!");
        }

    }

    public void mostrarMensagens(String mensagens){
        System.out.println("\n" + mensagens);
    }

    public void exibirConfirmacao(CartaoCredito cartaoCredito){
        System.out.println("\nPagamento confirmado no Cartão de Crédito." +
                "\nO valor final ficou com a taxa 3%: "+ cartaoCredito.valorFinal());
    }
}
