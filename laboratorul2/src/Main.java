public class Main {
    public static void main(String args[]) {
        Location c1 = new Location("Iasi", 0.0, 0.0);
        System.out.println(c1);
        Location c2 = new Location("Vaslui", 10.0, 20.0);
        System.out.println(c2);
        City city1 = new City("Bucuresti", 22.4, 35.4,10000);
        System.out.println(city1);
        Airport airport1 = new Airport("Otopeni", 25.2, 28.6, 4);
        System.out.println(airport1);

        Problem pb = new Problem("pb");
        pb.addLocation(new Location("restaurant", 22.5, 29.2));
        pb.addLocation(new Location("restaurant", 22.5, 29.2));
    }
}