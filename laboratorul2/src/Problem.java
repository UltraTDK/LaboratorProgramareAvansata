import java.util.ArrayList;
import java.util.List;

public class Problem {
    private final String name;
    private final List<Location> locations = new ArrayList<>();
    private final List<Road> roads = new ArrayList<>();

    // getters and setters for attributes
    Problem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Location> getLocation() {
        return locations;
    }

    public List<Road> getRoad() {
        return roads;
    }

    public void addLocation(Location newLocation) {
        int valid = 1;
        for (Location location : locations) {
            if(location.equals(newLocation)) {
                valid = 0;
            }
        }
        if (valid == 1) {
            locations.add(newLocation);
            System.out.println("Added location is valid.");
        } else {
            System.out.println("Added location is not valid.");
        }
    }

    public void addRoad(Road newRoad) {
        int valid = 1;
        for (Road road : roads) {
            if(road.equals(newRoad)) {
                valid = 0;
            }
        }
        if (valid == 1) {
            roads.add(newRoad);
            System.out.println("Added road is valid.");
        } else {
            System.out.println("Added road is not valid.");
        }
    }

    @Override
    public String toString() {
        return "Problem{" +
                "locations=" + locations +
                ", roads=" + roads +
                '}';
    }
}
