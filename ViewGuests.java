import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewGuests extends JFrame {
    public ViewGuests() {
        setTitle("View Guests");
        setSize(400, 300);
        setLocationRelativeTo(null);

        ArrayList<Guest> guests = MainMenu.guests;

        String[] columns = {"Name", "Room No.", "Days"};
        String[][] data = new String[guests.size()][3];

        for(int i=0; i<guests.size(); i++) {
            Guest g = guests.get(i);
            data[i][0] = g.getName();
            data[i][1] = g.getRoom();
            data[i][2] = String.valueOf(g.getDays());
        }

        JTable table = new JTable(data, columns);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

        setVisible(true);
    }
}