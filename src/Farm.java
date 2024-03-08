import java.util.ArrayList;

public class Farm {
    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal o) {
        animals.add(o);
    }

    public void killAnimal(int a){
        try {
            animals.remove(a);
        }catch (Exception e){
            System.out.println("not exist");
        }


    }

    @Override
    public String toString() {
        return "Farm{" +
                "animals=" + animals +
                '}';
    }
}
