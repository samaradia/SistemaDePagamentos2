package Controller;

import Model.CartaoCredito;
import View.CartaoCreditoView;

import java.util.Scanner;

public class CartaoCreditoController {
    private Scanner leitura;

    public CartaoCreditoController(Scanner leitura) {
        this.leitura = leitura;
    }

    CartaoCredito cartaoCredito = new CartaoCredito();
    CartaoCreditoView cartaoCreditoView = new CartaoCreditoView();

    public void fluxoDoCartao(){
        cartaoCreditoView.mostrarMensagens("Qual o limite do cartão: ");
        double limite = leitura.nextDouble();
        cartaoCredito.setLimiteDoCartao(limite);

        cartaoCreditoView.mostrarMensagens("\nDigite o valor a ser Pago: ");
        double valor = leitura.nextDouble();
        cartaoCredito.setValor(valor);

        boolean podeComprar = cartaoCredito.realizarCompra(valor);
        cartaoCreditoView.exibirAutorizacao(podeComprar);

        if (podeComprar){
            cartaoCredito.confirmarPagamento();
            cartaoCreditoView.exibirConfirmacao(cartaoCredito);
        }



    }

}
