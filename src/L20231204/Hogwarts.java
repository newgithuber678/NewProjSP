package L20231204;

public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int sum() {
        return powerOfMagic + transgressionDistance;
    }

    public void compareHogwarts(Hogwarts other) {
        if (sum() > other.sum()) {
            System.out.println(name + " обладает бОльшей мощностью магии, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает бОльшей мощностью магии, чем " + name);
        }
    }

    @Override
    public String toString() {
        return name + ":" +
                " powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance;
    }
}
