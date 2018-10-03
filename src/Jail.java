public class Jail {

    private int cellSize;
    private boolean window;
    private boolean door;
    private String items;

    public Jail(int cellSize, boolean window, boolean door, String items) {
        this.cellSize = cellSize;
        this.window = window;
        this.door = door;
        this.items = items;
    }

    public int getCellSize() {
        return cellSize;
    }

    public void setCellSize(int cellSize) {
        this.cellSize = cellSize;
    }

    public boolean isWindow() {
        return window;
    }

    public void setWindow(boolean window) {
        this.window = window;
    }

    public boolean isDoor() {
        return door;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
}
