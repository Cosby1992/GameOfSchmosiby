public class Store {

    private int size;
    private int cash;
    private String items;


    public Store(int size, int cash, String items) {
        this.size = size;
        this.cash = cash;
        this.items = items;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
}
