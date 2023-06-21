package org.example;
import java.io.IOException;

public class ClientApplication {
    public static void main(String[] args) throws IOException {
        GameClient client = new GameClient("127.0.0.1", 5000);
        client.start();
    }
}
