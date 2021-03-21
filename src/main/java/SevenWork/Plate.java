package SevenWork;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int appetite){ // уменьшение еды

        if (food >= appetite ) {
            food -= appetite;
            additiveFood(); //добавление еды если миска пуста
        return true;
        }
        return false;
    }

    public void additiveFood() { //добавление еды
        int wiskas = 10;
        if (food == 0) {
            food = food + wiskas;
        }
    }
}
