import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddGuest extends JFrame {
    private JTextField nameField, roomField, daysField;
    private JButton addButton;

    public AddGuest() {
        setTitle("Add Guest");
        setSize(350, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2,10,10));

        panel.add(new JLabel("Guest Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Room No.:"));
        roomField = new JTextField();
        panel.add(roomField);

        panel.add(new JLabel("Days:"));
        daysField = new JTextField();
        panel.add(daysField);

        addButton = new JButton("Add Guest");
        panel.add(new JLabel());
        panel.add(addButton);

        add(panel);

        addButton.addActionListener(e -> addGuest());

        setVisible(true);
    }

    private void addGuest() {
        String name = nameField.getText();
        String room = roomField.getText();
        String days = daysField.getText();

        if(name.isEmpty() || room.isEmpty() || days.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int daysInt = Integer.parseInt(days);
            MainMenu.guests.add(new Guest(name, room, daysInt));
            JOptionPane.showMessageDialog(this, "Guest added successfully!");
            dispose();
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Days must be a number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}