package SixthWork;

public class Main {
    public static void main(String[] args) {
        Dog[] gaf = new Dog[3];
        gaf[0] = new Dog("Лорд");
        gaf[1] = new Dog("Бутч");
        gaf[2] = new Dog("Леди");

        gaf[0].swim(7);
        gaf[1].run(240);
        gaf[2].run(500);

        Cat[] meow = new Cat[3];
        meow[0] = new Cat("Кофе");
        meow[1] = new Cat("Блэк");
        meow[2] = new Cat("Мафин");

        meow[0].swim(2);
        meow[1].run(5);
        meow[2].run(19);
    }
}
