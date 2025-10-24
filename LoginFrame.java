import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public LoginFrame() {
        setTitle("Hotel Management Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,10,10));

        panel.add(new JLabel("Username:"));
        userField = new JTextField();
        panel.add(userField);

        panel.add(new JLabel("Password:"));
        passField = new JPasswordField();
        panel.add(passField);

        loginButton = new JButton("Login");
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);

        loginButton.addActionListener(e -> checkLogin());

        setVisible(true);
    }

    private void checkLogin() {
        String user = userField.getText();
        String pass = String.valueOf(passField.getPassword());

        if(user.equals("admin") && pass.equals("admin123")) {
            new MainMenu();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}