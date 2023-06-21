import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
    
    final MainFrame frame;


    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");
    JButton exitBtn = new JButton("Exit");
    

    public ControlPanel(MainFrame frame) {
        this.frame = frame; init();
    }


    private void init() { 
        setLayout(new GridLayout(1, 4));
        // all buttons 
        add(loadBtn);
        add(saveBtn);
        add(exitBtn);
        // listeners for all buttons
        loadBtn.addActionListener(this::loadGame);
        saveBtn.addActionListener(this::saveGame);
        exitBtn.addActionListener(this::exitGame);
    } 


    private void loadGame(ActionEvent e) {
        frame.dispose();
    }


    private void saveGame(ActionEvent e) {
        frame.dispose();
    }


    private void exitGame(ActionEvent e) {
        frame.dispose();
    }
}