package CentralAprovacaoPedidos.Aprovadores;

import CentralAprovacaoPedidos.Services.Aprovador;
import CentralAprovacaoPedidos.Services.Pedido;

public class Gerente extends Aprovador {

    @Override
    public void processarPedido(Pedido pedido) {
        if (pedido.getValor() <= 1000) {
            System.out.println("O gerente aprovou o pedido.");
        } else {
            proximo.processarPedido(pedido);
        }
    }
}