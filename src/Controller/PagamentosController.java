package Controller;

import Model.Pagamentos;
import View.BoletoBancarioView;
import View.PagamentoView;

import java.util.Scanner;

public class PagamentosController {
    private Scanner leitura;

    CartaoCreditoController cartaoCreditoController;
    BoletoBancarioController boletoBancarioController;

    public PagamentosController(Scanner leitura) {
        this.leitura = leitura;
        this.cartaoCreditoController = new CartaoCreditoController(leitura);
        this.boletoBancarioController = new BoletoBancarioController(leitura);
    }

    PagamentoView pagamentoView = new PagamentoView();
    BoletoBancarioView boletoBancarioView  = new BoletoBancarioView();


    public Pagamentos mostrarMenu() {
        int opcao;

        do {
            pagamentoView.mostrarMenu();

            opcao = leitura.nextInt();

            if (opcao == 1) {
                cartaoCreditoController.fluxoDoCartao();


            } else if (opcao == 2) {
                boletoBancarioController.fluxoDoBoleto();



            } else if (opcao == 3) {
                pagamentoView.mostrarMensagens("Digite o valor a ser  pago: ");

            } else if (opcao == 4) {
                pagamentoView.mostrarMensagens("Encerrando! ");

            } else {
                pagamentoView.mostrarMensagens("Opção inválida, digite novamente: ");

            }
        } while (opcao != 4);

        return null;
    }

}
