import layout.BorderLayoutDemo;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class BorderLayoutDemoTest {

    @org.junit.jupiter.api.Test
    void createBorderFrame() {
        BorderLayoutDemo demo = new BorderLayoutDemo();

        JFrame frame = demo.CreateBorderFrame();

        assertNotNull(frame);
        assertEquals("Border Layout Demo", frame.getTitle());
        assertEquals(600, frame.getWidth());
        assertEquals(400, frame.getHeight());

    }

    @org.junit.jupiter.api.Test
    void createTitleLabel() {
        BorderLayoutDemo demo = new BorderLayoutDemo();

        JLabel label = demo.CreateTitleLabel();

        assertNotNull(label);
        assertEquals("Application Title", label.getText());
    }

    @org.junit.jupiter.api.Test
    void createTextArea() {
        BorderLayoutDemo demo = new BorderLayoutDemo();

        JTextArea area = demo.CreateTextArea();

        assertNotNull(area);
    }

    @org.junit.jupiter.api.Test
    void createPanel() {
        BorderLayoutDemo demo = new BorderLayoutDemo();

        JPanel panel = demo.CreatePanel();

        assertNotNull(panel);
        assertEquals(3, panel.getComponentCount());
    }

    @org.junit.jupiter.api.Test
    void createScrollPane() {
        BorderLayoutDemo demo = new BorderLayoutDemo();

        JScrollPane scroll = demo.CreateScrollPane();

        assertNotNull(scroll);
    }

    @org.junit.jupiter.api.Test
    void createSubmitButton() {
        BorderLayoutDemo demo = new BorderLayoutDemo();

        JButton button = demo.CreateSubmitButton();

        assertNotNull(button);
        assertEquals("Submit", button.getText());
    }
}