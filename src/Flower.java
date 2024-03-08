public class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected FlowerType flower;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth, FlowerType flower) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
        this.flower= flower;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public void watered(){
        chanceOfGrowth+= 20;
    }

}
