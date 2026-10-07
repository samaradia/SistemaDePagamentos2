import Controller.PagamentosController;
import Model.BoletoBancario;
import Model.CartaoCredito;
import Model.Pagamentos;
import Model.Pix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        PagamentosController pagamentosController = new PagamentosController(leitura);
        Pagamentos pagamentos = pagamentosController.mostrarMenu();

    }
}