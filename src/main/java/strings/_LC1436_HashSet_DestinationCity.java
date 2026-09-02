import java.util.*;

public class _LC1436_HashSet_DestinationCity {

    public static String destCity(List<List<String>> paths) {

        Set<String> startCities = new HashSet<>();

        // Store all cities that appear as starting cities
        for (List<String> path : paths) {
            startCities.add(path.get(0));
        }

        // Destination city is the city that never appears as a starting city
        for (List<String> path : paths) {
            String destination = path.get(1);

            if (!startCities.contains(destination)) {
                return destination;
            }
        }

        return "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of paths: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<List<String>> paths = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter source city: ");
            String source = sc.nextLine();

            System.out.print("Enter destination city: ");
            String destination = sc.nextLine();

            paths.add(Arrays.asList(source, destination));
        }

        String result = destCity(paths);

        System.out.println("Destination City: " + result);

        sc.close();
    }
}