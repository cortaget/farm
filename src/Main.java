public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Animal("dgj","fgj",Size.SMALL,"fh",AnimalType.FROG));
        System.out.println(1+" "+farm);
        farm.killAnimal(0);
        System.out.println(2+" "+farm);




        System.out.println();


        farm.addFlower(new Flower("Boris",56,1000,4,FlowerType.BORIS));
        System.out.println(1+" "+farm);
        farm.wateredFlower(0);
        System.out.println(2+" "+farm);
        farm.controlGround();
        farm.killFlower(0);
        System.out.println(3+" "+farm);
    }
}