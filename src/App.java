/*
* File: App.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft II-N
* Date: 2026-09-28
* Github: https://github.com/eros/
* Licenc: MIT
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hálózat...");

        Network network = new Network();
        network.connectToNetwork("Egy");
        network.disconnectFromNetwork();
    }
}
