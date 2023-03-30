package org.example;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.URI;


public class Desktop extends JFrame implements ActionListener {

    static JFrame frame;

    public void init() {

        Desktop desktop = new Desktop();
  

        // create a frame
        frame = new JFrame("Catalog");
  

        // create a panel
        JPanel panel = new JPanel();
  

        // create a button
        JButton button = new JButton("Launch");


        // add Action Listener
        button.addActionListener(desktop);
  
        panel.add(button);
        frame.add(panel);
        frame.setSize(400, 400);
    }
       

    void open(File filePath) {
    }


    static Desktop getDesktop() {
        return null;
    }


    // if button is pressed
    public void actionPerformed(ActionEvent event)
    {
        try {
            File filePath = new File("C:\\Date\\Facultate\\Anul 3\\Semestrul 2\\Java\\Laborator\\laboratorul5\\Catalog\\catalog.json");
  
            Desktop desk = Desktop.getDesktop();
            desk.open(filePath);
        }
        catch (Exception evt) {
            JOptionPane.showMessageDialog(this, evt.getMessage());
        }
    }


    public void browse(URI uri) {
    }
}