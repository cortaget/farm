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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getSpecialCare() {
        return specialCare;
    }

    public void setSpecialCare(String specialCare) {
        this.specialCare = specialCare;
    }

    public AnimalType getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalType animal) {
        this.animal = animal;
    }
}
