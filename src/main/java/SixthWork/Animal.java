package SixthWork;

public abstract class Animal {
    protected final String name;
    protected final int swinPossibleDistance;
    protected final int runPossibleDistance;


    public Animal(String name, int swinPossibleDistance, int runPossibleDistance) {
        this.name = name;
        this.swinPossibleDistance = swinPossibleDistance;
        this.runPossibleDistance = runPossibleDistance;
    }

    public String getName() {
        return name;
    }

    public int getSwinPossibleDistance() {
        return swinPossibleDistance;
    }

    public int getRunPossibleDistance() {
        return runPossibleDistance;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
