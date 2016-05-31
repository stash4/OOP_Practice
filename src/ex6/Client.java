package ex6;

public class Client {
    private Server server;

    public Client(Server s) {
        server = s;
        server.connect();
    }
}
