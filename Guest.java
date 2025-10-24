public class Guest {
    private String name;
    private String room;
    private int days;

    public Guest(String name, String room, int days) {
        this.name = name;
        this.room = room;
        this.days = days;
    }

    public String getName() { return name; }
    public String getRoom() { return room; }
    public int getDays() { return days; }
}