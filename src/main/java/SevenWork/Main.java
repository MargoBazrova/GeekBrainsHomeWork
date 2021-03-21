package SevenWork;

public class Main {
    public static void main(String[] args) {
        Cat[] meow = new Cat[3];
        meow[0] = new Cat("Кофе", 50);
        meow[1] = new Cat("Блэк", 50);
        meow[2] = new Cat("Мафин", 45);
        Plate plate = new Plate(100);
        plate.info();
        meow[0].eat(plate);
        meow[0].info();
        plate.info();
        meow[1].eat(plate);
        meow[1].info();
        plate.info();
        meow[2].eat(plate);
        meow[2].info();
        plate.info();
    }

}
