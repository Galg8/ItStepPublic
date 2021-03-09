package Task1;

public class Ranger {

    private int starter;
    private int ender;
    private int range;
    private boolean isIntersect;

    public Ranger(String a, String b) {
        this.starter = Integer.parseInt(a);
        this.ender = Integer.parseInt(b);
    }

    public int throwRange() {
            this.range = this.ender - this.starter;
            return this.range;
    }

    // ======== GETERY
    public int getStarter() {
        return this.starter;
    }

    public int getEnder() {
        return this.ender;
    }

}
