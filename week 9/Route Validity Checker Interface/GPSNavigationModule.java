public class GPSNavigationModule implements NavigationService {

    @Override
    public void navigate(String startPoint, String endPoint, RouteValidator validator)
            throws NavigationFailedException {

        System.out.println("Attempting to navigate from " + startPoint + " to " + endPoint + "...");

        if ("Kalanki".equalsIgnoreCase(startPoint)) {
            throw new NavigationFailedException("GPS signal lost near Kalanki! Welcome to Kathmandu traffic!");
        }

        try {
            double distance = simulatedDistance(startPoint, endPoint);
            if (validator.isValidCommuteRoute(startPoint, endPoint, distance)) {
                System.out.println("Navigation successful! Estimated time: 20 minutes (or 2 hours depending on traffic).");
            }
        } catch (InvalidRouteException e) {
            throw new NavigationFailedException("Route validation failed!", e);
        }
    }

    private double simulatedDistance(String start, String end) {
        return 5.0; 
    }

    public static void main(String[] args) {
        RouteValidator validator = new KathmanduTrafficValidator();
        NavigationService gps = new GPSNavigationModule();

        try {
            gps.navigate("Kalanki", "Balaju", validator);
        } catch (NavigationFailedException e) {
            System.out.println("Navigation failed: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
    }
}
