public class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;
    protected AnimalType animal;

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                ", animal=" + animal +
                '}';
    }

    public Animal(String type, String name, Size size, String specialCare, AnimalType animal) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
        this.animal = animal;
    }

}
