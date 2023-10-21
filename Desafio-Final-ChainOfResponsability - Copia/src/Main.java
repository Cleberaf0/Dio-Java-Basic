public class Main {

    public static void main(String[] args) {
        // Criar os handlers
        ManagerHandler managerHandler = new ManagerHandler();
        RegionalManagerHandler regionalManagerHandler = new RegionalManagerHandler();
        VicePresidentHandler vicePresidentHandler = new VicePresidentHandler();

        // Conectar os handlers em uma cadeia
        managerHandler.setNext(regionalManagerHandler);
        regionalManagerHandler.setNext(vicePresidentHandler);

        // Criar um pedido
        Request request = new Request("departamento", 1000);

        // Passar o pedido para a cadeia
        managerHandler.handleRequest(request);
    }
}