import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    ConfigPanel configPanel;
    ControlPanel controlPanel;
    BetterDrawingPanel canvas;


    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    

    public MainFrame() {
        super("My Drawing Application");
        setSize(WIDTH, HEIGHT);
        init();
    }


    private void init() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        controlPanel = new ControlPanel(this);


        configPanel = new ConfigPanel(this);


        // Initialize components
        canvas = new BetterDrawingPanel(this);


        // Add components to the frame
        add(configPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }
}
