public class Road {
    private String name;
    private RoadType type;
    private Location locationA;
    private Location locationB;

    public Road(String name, RoadType type, Location locationA, Location locationB) {
        this.name = name;
        this.type = type;
        this.locationA = locationA;
        this.locationB = locationB;
    }

    public String getName() {
        return name;
    }
    public RoadType getType() {
        return type;
    }
    public Location getLocationA() {
        return locationA;
    }
    public Location getLocationB() {
        return locationB;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(RoadType type) {
        this.type = type;
    }
    public void setLocationA(Location locationA) {
        this.locationA = locationA;
    }
    public void setLocationB(Location locationB) {
        this.locationB = locationB;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Road)) {
            return false;
        }
        Road road = (Road) obj;
        return name.equals(road.name) && locationA.equals(road.locationA)
                && locationB.equals(road.locationB);
    }

    @Override
    public String toString() {
        return "Road{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", locationA=" + locationA +
                ", locationB=" + locationB +
                '}';
    }
}
