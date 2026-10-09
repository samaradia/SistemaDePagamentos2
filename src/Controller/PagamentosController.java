package Controller;

import Model.Pagamentos;
import View.BoletoBancarioView;
import View.PagamentoView;
import View.PixView;

import java.util.Scanner;

public class PagamentosController {
    private Scanner leitura;

    CartaoCreditoController cartaoCreditoController;
    BoletoBancarioController boletoBancarioController;
    PixController pixController;

    public PagamentosController(Scanner leitura) {
        this.leitura = leitura;
        this.cartaoCreditoController = new CartaoCreditoController(leitura);
        this.boletoBancarioController = new BoletoBancarioController(leitura);
        this.pixController = new PixController(leitura);
    }

    PagamentoView pagamentoView = new PagamentoView();
    BoletoBancarioView boletoBancarioView  = new BoletoBancarioView();
    PixView pixView = new PixView();


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
                pixController.fluxoDoPix();

            } else if (opcao == 4) {
                pagamentoView.mostrarMensagens("Encerrando! ");

            } else {
                pagamentoView.mostrarMensagens("Opção inválida, digite novamente: ");

            }
        } while (opcao != 4);

        return null;
    }

}
