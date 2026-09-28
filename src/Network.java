/*
* File: Network.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft II-N
* Date: 2026-09-28
* Github: https://github.com/eros/
* Licenc: MIT
*/

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
