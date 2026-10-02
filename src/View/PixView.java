package View;

import Model.Pix;

public class PixView {
    public void exibirComDesconto(Pix pix){
        System.out.println("O pagamento com o pix possui um desconto %5, " +
                "totalizando com o desconto:  " + pix.calcularTaxa());
    }

    public void exibirPixConfirmado(){
        System.out.println("Pagamento no pix confirmado com sucesso!");
    }
}
