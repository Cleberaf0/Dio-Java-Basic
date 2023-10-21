public class VicePresidentHandler extends Handler {

    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("vice-presidente")) {
            // Aprovar o pedido
            System.out.println("Vice-presidente aprovou o pedido.");
        } else {
            // Rejeitar o pedido
            System.out.println("Pedido rejeitado.");
        }
    }
}
