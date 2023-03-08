public class Airport extends Location {
    int numberOfTerminals;

    public Airport(String name, Double setX, Double setY, int numberOfTerminals) {
        super(name, setX, setY);
        this.numberOfTerminals = numberOfTerminals;
    }

    public int getNumberOfTerminals() {
        return numberOfTerminals;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + getName() + '\'' +
                ", First coordinate=" + getX() +
                ", Second coordinate=" + getY() +
                ", Number of terminals=" + numberOfTerminals +
                '}';
    }
}