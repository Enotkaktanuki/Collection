public class HeavyBox{
    private double weight;
    private String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeavyBox(String name,double weight) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nHeavyBox: " +
                "\nВес: " + weight +
                "\nИмя: " + name;
    }
}
