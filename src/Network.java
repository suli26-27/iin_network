public class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Kapcsolódva");
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Leválasztva");
    }
    
}
