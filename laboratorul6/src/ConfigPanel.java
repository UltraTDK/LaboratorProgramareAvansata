import java.awt.FlowLayout;
import javax.swing.*;


public class ConfigPanel extends JPanel {

    final MainFrame frame;
    private JLabel dotsLabel, linesLabel;
    JSpinner dotsSpinner;
    JComboBox linesCombo;
    JButton createButton;

    
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }


    public void init() {
        setLayout(new FlowLayout());
        dotsLabel = new JLabel("Number of Dots:");
        linesLabel = new JLabel("Number of Lines:");  
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));
        linesCombo = new JComboBox(new Double[]{1.0, 0.4, 0.3, 0.0});
        createButton = new JButton("Create new game");
        add(dotsLabel);
        add(linesLabel);
        add(dotsSpinner);
        add(linesCombo);
        add(createButton);
    }
}
