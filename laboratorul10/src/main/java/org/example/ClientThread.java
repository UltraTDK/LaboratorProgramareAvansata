package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread {
    private final Socket clientSocket;

    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Am primit comanda: " + inputLine);
                if (inputLine.equals("stop")) {
                    out.println("Serverul a fost oprit.");
                    break;
                } else {
                    out.println("Serverul a primit un request " + inputLine);
                }
            }

            clientSocket.close();
            System.out.println("Clientul s-a deconectat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


