package SixthWork;

public class Dog extends Animal {

    public Dog(String name) {
        super (name, 10, 500);
    }

    @Override
    public void swim(int distance) {
        if (swinPossibleDistance > distance) {
            System.out.println("Собака " + name + " проплывет всю дитанцию (" + distance + ")");
        } else {
            System.out.println("Собака " + name + " не может проплыть такую дистанцию =(");
        }
    }

    @Override
    public void run(int distance) {
        if (runPossibleDistance > distance) {
            System.out.println("Собака " + name + " пробежит всю дитанцию (" + distance + ")");
        } else {
            System.out.println("Собака " + name + " не может пробежать такую дистанцию =(");
        }
    }
}
