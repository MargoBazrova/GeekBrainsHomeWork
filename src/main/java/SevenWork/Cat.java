package SevenWork;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;

    }
    public void eat(Plate plate) {
       isFull = plate.decreaseFood(appetite);
    }

    public void info() {
        if (isFull) {
            System.out.println("Котик " + name + " cыт!");
        } else {
            System.out.println("Котик " + name + " голоден!");
        }
    }

}
