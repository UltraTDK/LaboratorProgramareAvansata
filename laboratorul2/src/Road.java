public class Road {
    private String name;
    private RoadType type;
    private Location locationA;
    private Location locationB;

    public Road(String name, RoadType type, Location a, Location b) {
        this.name = name;
        this.type = type;
        this.locationA = a;
        this.locationB = b;
    }

    public Location getLocationA() {
        return locationA;
    }

    public void setLocationA(Location locationA) {
        this.locationA = locationA;
    }

    public Location getLocationB() {
        return locationB;
    }

    public void setLocationB(Location locationB) {
        this.locationB = locationB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoadType getType() {
        return type;
    }

    public void setType(RoadType type) {
        this.type = type;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || !(obj instanceof Room)) {
//            return false;
//        }
//        Road other = (Road) obj;
//        return name.equals(other.name);
//    }

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
