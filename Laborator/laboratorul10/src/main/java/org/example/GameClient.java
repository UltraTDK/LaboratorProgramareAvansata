package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GameClient {
    private final String host;
    private final int port;

    public GameClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws IOException {
        Socket socket = new Socket(host, port);
        System.out.println("Clientul a fost conectat la portul: " + port);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String inputLine;
        while ((inputLine = userInput.readLine()) != null) {
            out.println(inputLine);
            String serverResponse = in.readLine();
            System.out.println("Raspunsul serverului: " + serverResponse);
            if (inputLine.equals("exit")) {
                break;
            }
        }

        socket.close();
        System.out.println("Deconectat de la server.");
    }
}
