import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    JFrame frame;
    JLabel titlelabel;
    JPanel WestPanel;
    JTextArea textArea;
    JScrollPane scrollPane;
    JButton submitButton;

    public BorderLayoutDemo() {
        this.CreateBorderFrame();
    }

    public JFrame CreateBorderFrame() {
        frame = new JFrame("Border Layout Demo");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(this.CreateTitleLabel(), BorderLayout.NORTH);
        frame.add(this.CreateTextArea(), BorderLayout.CENTER);
        frame.add(this.CreateScrollPane(), BorderLayout.CENTER);
        frame.add(this.CreateSubmitButton(), BorderLayout.SOUTH);
        frame.add(this.CreatePanel(), BorderLayout.WEST);
        frame.setVisible(true);
        return frame;
    }

    public JLabel CreateTitleLabel() {
        titlelabel = new JLabel("Application Title", JLabel.CENTER);
        return titlelabel;
    }

    public JTextArea CreateTextArea() {
        textArea = new JTextArea();
        return textArea;
    }

    public JPanel CreatePanel() {
        WestPanel = new JPanel(new GridLayout(3, 0));
        WestPanel.add(new JButton("Option 1"));
        WestPanel.add(new JButton("Option 2"));
        WestPanel.add(new JButton("Option 3"));
        return WestPanel;
    }

    public JScrollPane CreateScrollPane() {
        scrollPane = new JScrollPane(CreateTextArea());
        return scrollPane;
    }

    public JButton CreateSubmitButton() {
        submitButton = new JButton("Submit");
        return submitButton;
    }
}
