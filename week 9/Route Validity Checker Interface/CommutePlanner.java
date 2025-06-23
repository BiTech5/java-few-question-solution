public class CommutePlanner {

    public static void planMyCommute(String origin, String destination,
                                     RouteValidator validator, NavigationService navigator) {
        System.out.println("Planning your commute from " + origin + " to " + destination + "...");

        try {
            navigator.navigate(origin, destination, validator);
        } catch (NavigationFailedException e) {
            System.out.println("Commute failed: " + e.getMessage());

            Throwable cause = e.getCause();
            if (cause != null) {
                if (cause instanceof SameLocationException) {
                    System.out.println("Cannot plan: Origin and destination are the same.");
                } else if (cause instanceof InvalidRouteException) {
                    System.out.println("Cannot plan: Invalid route details.");
                }
            } else {
                System.out.println("Cannot plan: GPS issue.");
            }
        } finally {
            System.out.println("Commute planning for " + origin + " to " + destination + " completed.\n");
        }
    }

    public static void main(String[] args) {
        RouteValidator validator = new KathmanduTrafficValidator();
        NavigationService navigator = new GPSNavigationModule();

        planMyCommute("Baneshwor", "Baneshwor", validator, navigator); 
        planMyCommute("Thamel", "Patan", validator, navigator); 
        planMyCommute("Kalanki", "Balaju", validator, navigator); 
        planMyCommute("Sankhamul", "Basantapur", validator, navigator); 
    }
}
