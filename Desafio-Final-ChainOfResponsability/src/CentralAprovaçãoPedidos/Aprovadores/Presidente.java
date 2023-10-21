package CentralAprovaçãoPedidos.Aprovadores;

import CentralAprovaçãoPedidos.Services.Aprovador;
import CentralAprovaçãoPedidos.Services.Pedido;

public class Presidente extends Aprovador {

    @Override
    public void processarPedido(Pedido pedido) {
        System.out.println("O presidente aprovou o pedido.");
    }
}