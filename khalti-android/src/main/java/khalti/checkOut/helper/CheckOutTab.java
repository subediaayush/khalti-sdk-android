package khalti.checkOut.helper;

public class CheckOutTab {

    private String name;
    private int position;

    public CheckOutTab(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}