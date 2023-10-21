public class RegionalManagerHandler extends Handler {

    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("regional")) {
            // Aprovar o pedido
            System.out.println("Gerente regional aprovou o pedido.");
        } else {
            // Passar o pedido para o próximo handler
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}