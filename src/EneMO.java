public class EneMO {

    private int health;
    private int dmg;
    private int resistance;

    public EneMO(int health, int dmg, int resistance) {
        this.health = health;
        this.dmg = dmg;
        this.resistance = resistance;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
}
