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

        if (podeComprar){
            cartaoCredito.confirmarPagamento();

            double valorFinal = cartaoCredito.valorFinal();

            cartaoCreditoView.mostrarMensagens("\nO valor final com taxa de 3%: " + valorFinal);
        } else {
            cartaoCreditoView.mostrarMensagens("\nCompra não autorizada!");
        }



    }

}
