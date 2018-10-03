public class Player {


    private int health;
    private int heat;
    private String name;
    private int cash;
    private int maxInventory;
    private int inventory;
    private int dmg;
    private int resistance;
    private int strength;


    public Player(int health, int heat, String name) {
        this.health = health;
        this.heat = heat;
        this.name = name;
        this.cash = 0;
        this.inventory = 0;
        this.dmg = 4;
        this.resistance = 0;
        this.strength = 20;
        this.maxInventory = 5;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getMaxInventory() {
        return maxInventory;
    }

    public void setMaxInventory(int maxInventory) {
        this.maxInventory = maxInventory;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return
                "~~~~~~Player stats~~~~~~"+
                "\n |health        " + health +"/100"+
                "\n |heat          " + heat +"/100"+
                "\n |cash          " + cash +" $"+
                "\n |inventory     " + inventory +"/"+maxInventory+
                "\n |dmg           " + dmg +
                "\n |resistance    " + resistance +
                "\n |strength      " + strength +
                "\n~~~~~~~~~~~~~~~~~~~~~~";
    }
}
