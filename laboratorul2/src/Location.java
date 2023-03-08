public class Location {
    private String name;
    private Double setX;
    private Double setY;

    public Location(String name, Double setX, Double setY) {
        this.name = name;
        this.setX = setX;
        this.setY = setY;
    }

    public String getName() {
        return name;
    }
    public Double getX() {
        return setX;
    }
    public Double getY() {
        return setY;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setX(Double X) {
        this.setX = X;
    }
    public void setY(Double Y) {
        this.setY = Y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return name.equals(location.name) && setX.equals(location.setX)
                && setY.equals(location.setY);
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
