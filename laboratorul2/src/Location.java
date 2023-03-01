public class Location {
    private String name;
    private Double setX;
    private Double setY;
    public Location() { }
    public Location(String name, Double a, Double b) {
        this.name = name;
        this.setX = a;
        this.setY = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getX() {
        return setX;
    }

    public void setX(Double X) {
        this.setX = X;
    }

    public Double getY() {
        return setY;
    }

    public void setY(Double Y) {
        this.setY = Y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", setX=" + setX +
                ", setY=" + setY +
                '}';
    }
}
