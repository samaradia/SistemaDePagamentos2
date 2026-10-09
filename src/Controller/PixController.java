package Controller;

import Model.Pix;
import View.PixView;

import java.util.Scanner;

public class PixController {
    private Scanner leitura;

    public PixController(Scanner leitura) {
        this.leitura = leitura;
    }

    PixView pixView = new PixView();

    public void fluxoDoPix(){
        pixView.mostrarMensagens("\nDigite o valor a ser pago: ");
        double valorPix = leitura.nextDouble();
        Pix pix = new Pix(valorPix);

        pix.confirmarPagamento();
        pixView.exibirComDesconto(pix);
        pixView.exibirPixConfirmado();
   }
}
