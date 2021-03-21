package SixthWork;

public class Cat extends Animal{

    public Cat(String name) {
        super (name, 0, 20);
    }
    @Override
    public void run(int distance) {
        if (runPossibleDistance > distance) {
            System.out.println("Кот " + name + " пробежит всю дитанцию (" + distance + ")");
        } else {
            System.out.println("Кот " + name + " не может пробежать такую дистанцию =(");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают");
    }
    }
