package Controller;

import Model.Pagamentos;
import Model.Pix;
import View.PagamentoView;

import java.util.Scanner;

public class PagamentosController {
    private Scanner leitura;

    public PagamentosController(Scanner leitura) {
        this.leitura = leitura;
    }

    PagamentoView pagamentoView = new PagamentoView();

    public Pagamentos mostrarMenu(){
        int opcao;

        do{
            pagamentoView.mostrarMenu();

            opcao = leitura.nextInt();

            if(opcao == 1){
                
            }
        }
    }


}
