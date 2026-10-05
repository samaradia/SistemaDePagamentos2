package Controller;

import Model.CartaoCredito;
import Model.Pagamentos;
import Model.Pix;
import View.CartaoCreditoView;
import View.PagamentoView;

import java.util.Scanner;

public class PagamentosController {
    private Scanner leitura;

    public PagamentosController(Scanner leitura) {
        this.leitura = leitura;
    }

    PagamentoView pagamentoView = new PagamentoView();

    public Pagamentos mostrarMenu() {
        int opcao;

        do {
            pagamentoView.mostrarMenu();

            opcao = leitura.nextInt();

            if (opcao == 1) {
                pagamentoView.mostrarMensagens("Digite o valor a ser Pago: ");
            } else if (opcao == 2){
                pagamentoView.mostrarMensagens("Digite o valor a ser  pago: ");
            } else if (opcao == 3 ) {
                pagamentoView.mostrarMensagens("Digite o valor a ser  pago: ");
            } else {
                pagamentoView.mostrarMensagens("Opção inválida, digite novamente: ");
            }
        } while (opcao != 3);
        return null;

    }

}
