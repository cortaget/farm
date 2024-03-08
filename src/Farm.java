import java.util.ArrayList;

public class Farm {
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Flower> flowers = new ArrayList<>();
    private int ground;


    public void controlGround(){
        ground = 0;
        for (int i = 0;i< flowers.size();i++){
            ground += flowers.get(i).getNeededArea();
            if (ground>100){
                System.out.println("not enought NeededArea");
                throw new RuntimeException("not enought NeededArea");
            }
        }

    }

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

    public void addFlower(Flower o) {
        flowers.add(o);
    }

    public void killFlower(int a){
        try {
            flowers.remove(a);
        }catch (Exception e){
            System.out.println("not exist");
        }
    }
    public void wateredFlower(int a){
        flowers.get(a).watered();
    }


    @Override
    public String toString() {
        return "Farm{" +
                "animals=" + animals +
                ", flowers=" + flowers +
                '}';
    }
}
