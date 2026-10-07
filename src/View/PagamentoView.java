package View;

import Model.Pagamentos;

public class PagamentoView {
    public void mostrarMenu(){
        System.out.println("SISTEMA DE PAGAMENTOS!");
        System.out.println("======================");
        System.out.println("1 - Cartão de crédito.");
        System.out.println("2 - Boleto Bancario.");
        System.out.println("3 - Pix.");
        System.out.println("4 - Sair.");
    }

    public void mostrarMensagens(String mensagens){
        System.out.println("\n" + mensagens);
    }

    public void exibirConfirmacao(Pagamentos pagamentos){
        System.out.println("Pagamento confirmado de: " + pagamentos.getValor());
    }


}
