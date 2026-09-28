public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hálózat...");

        Network network = new Network();
        network.connectToNetwork("Egy");
        network.disconnectFromNetwork();
    }
}
