package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    private final int port;

    public GameServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serverul a pornit la portul: " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Un client nou s-a conectat: " + clientSocket.getInetAddress().getHostAddress());

                // pornesc un thread pentru fiecare client
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();
            }
        }
    }
}

