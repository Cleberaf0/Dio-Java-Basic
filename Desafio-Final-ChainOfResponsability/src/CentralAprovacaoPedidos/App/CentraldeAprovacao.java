package CentralAprovacaoPedidos.App;

import CentralAprovacaoPedidos.Aprovadores.Diretor;
import CentralAprovacaoPedidos.Aprovadores.Gerente;
import CentralAprovacaoPedidos.Aprovadores.Presidente;
import CentralAprovacaoPedidos.Services.Aprovador;
import CentralAprovacaoPedidos.Services.Pedido;

/**
* <h1>CentraldeAprovação</h1>
* Realiza a aprovação dos pedidos de acordo com fluxo da empresa.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Cleberaf0
* @version 1.0
* @since   19/01/2022
*/

public class CentraldeAprovacao {

    public static void main(String[] args) {

        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();
        Aprovador presidente = new Presidente();

        gerente.setProximo(diretor);
        diretor.setProximo(presidente);

        Pedido pedido = new Pedido("Engenharia",10000);
        gerente.processarPedido(pedido);

        pedido = new Pedido("Marketing",5000);
        gerente.processarPedido(pedido);

        pedido = new Pedido("Banda Larga",500);
        gerente.processarPedido(pedido);
        
    }
}