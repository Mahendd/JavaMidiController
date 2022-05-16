package GUI;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {
    int numClicks = 0;
    private final JLabel label;
    private final JButton buttonAdd, buttonSub;
    private final JTextField textField;

    public Gui() {

        JFrame frame = new JFrame();
        buttonAdd = new JButton("Add");
        buttonAdd.addActionListener(this);
        buttonSub = new JButton("Sub");
        buttonSub.addActionListener(this);
        textField = new JTextField();
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFromText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFromText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFromText();
            }
        });
        label = new JLabel(String.format("Clicked %d times", numClicks));
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(buttonAdd);
        panel.add(buttonSub);
        panel.add(textField);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Gui");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buttonAdd)){
            numClicks++;
        }
        else if (e.getSource().equals(buttonSub)){
            numClicks--;
        }
        label.setText(String.format("Clicked %s times", numClicks));
    }

    public void updateFromText() {
        try {
            numClicks = Integer.parseInt(textField.getText());
        } catch (Exception e) {
            numClicks = 0;
        }
        label.setText(String.format("Clicked %s times", numClicks));
    }

    public static void main(String[] args) {
        new Gui();
    }
}
