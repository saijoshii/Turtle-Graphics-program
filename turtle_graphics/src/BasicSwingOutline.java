import javax.swing.*;
import java.awt.*;

public class BasicSwingOutline {
    public static void main(String[] args) {
        // Create the main JFrame (window)
        JFrame frame = new JFrame("Basic Swing Outline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Set window size (width, height)
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
        panel.setLayout(new FlowLayout()); 

        JLabel label = new JLabel("This is a basic Swing Outline Box!");
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}