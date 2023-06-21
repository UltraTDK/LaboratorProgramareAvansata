public class City extends Location {
    private int populationNr;

    public City(String name, Double setX, Double setY, int populationNr) {
        super(name, setX, setY);
        this.populationNr = populationNr;
    }

    public int getPopulationNr() {
        return populationNr;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + getName() + '\'' +
                ", First coordinate=" + getX() +
                ", Second coordinate=" + getY() +
                ", Population number=" + populationNr +
                '}';
    }
}
