import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainMenu extends JFrame {
    public static ArrayList<Guest> guests = new ArrayList<>();

    public MainMenu() {
        setTitle("Hotel Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1,10,10));

        JButton addGuestBtn = new JButton("Add Guest");
        JButton viewGuestBtn = new JButton("View Guests");
        JButton exitBtn = new JButton("Exit");

        panel.add(addGuestBtn);
        panel.add(viewGuestBtn);
        panel.add(exitBtn);

        add(panel);

        addGuestBtn.addActionListener(e -> new AddGuest());
        viewGuestBtn.addActionListener(e -> new ViewGuests());
        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}