package org.example;
import java.io.IOException;

public class ServerApplication {
    public static void main(String[] args) throws IOException {
        GameServer server = new GameServer(5000);
        server.start();
    }
}
