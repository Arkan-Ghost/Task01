package layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    JFrame Frame;
    JLabel TitleLabel;
    JPanel WestPanel;
    JTextArea TextArea;
    JScrollPane ScrollPane;
    JButton SubmitButton;

    public BorderLayoutDemo() {
        this.CreateBorderFrame();
    }

    public JFrame CreateBorderFrame() {
        Frame = new JFrame("Border Layout Demo");
        Frame.setSize(600, 400);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Frame.setLayout(new BorderLayout());
        Frame.add(this.CreateTitleLabel(), BorderLayout.NORTH);
        Frame.add(this.CreateTextArea(), BorderLayout.CENTER);
        Frame.add(this.CreateScrollPane(), BorderLayout.WEST);
        Frame.add(this.CreateSubmitButton(), BorderLayout.SOUTH);
        Frame.add(this.CreatePanel(), BorderLayout.WEST);
        Frame.setVisible(true);
        return Frame;
    }

    public JLabel CreateTitleLabel() {
        TitleLabel = new JLabel("Application Title", SwingConstants.CENTER);
        return TitleLabel;
    }

    public JTextArea CreateTextArea() {
        TextArea = new JTextArea();
        return TextArea;
    }

    public JPanel CreatePanel() {
        WestPanel = new JPanel(new GridLayout(3, 0));
        WestPanel.add(new JButton("Option 1"));
        WestPanel.add(new JButton("Option 2"));
        WestPanel.add(new JButton("Option 3"));
        return WestPanel;
    }

    public JScrollPane CreateScrollPane() {
        ScrollPane = new JScrollPane(CreateTextArea());
        return ScrollPane;
    }

    public JButton CreateSubmitButton() {
        SubmitButton = new JButton("Submit");
        return SubmitButton;
    }
}
