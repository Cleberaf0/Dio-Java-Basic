package CentralAprovaçãoPedidos.Aprovadores;

import CentralAprovaçãoPedidos.Services.Aprovador;
import CentralAprovaçãoPedidos.Services.Pedido;

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