

public class KathmanduTrafficValidator implements RouteValidator {

    @Override
    public boolean isValidCommuteRoute(String origin, String destination, double distanceKm)
            throws SameLocationException,InvalidRouteException {

        if (origin.equalsIgnoreCase(destination)) {
            throw new SameLocationException("Origin and destination cannot be the same! Are you just spinning in circles, Damodar?");
        }

        else if (distanceKm < 0.1 || distanceKm > 30) {
            throw new InvalidRouteException("Distance " + distanceKm + "km is unrealistic for Kathmandu commute!");
        }
        else{

            return true;
        }
    }
    public static void main(String[] args) {
        RouteValidator validator = new KathmanduTrafficValidator();

        String[][] testCases = {
            {"Kathmandu", "Kathmandu", "5.0"},
            {"Lalitpur", "Bhaktapur", "0.05"},
            {"Kirtipur", "Banepa", "35.0"},
            {"Jawalakhel", "Maitighar", "7.5"}
        };

        for (String[] testCase : testCases) {
            String origin = testCase[0];
            String destination = testCase[1];
            double distance = Double.parseDouble(testCase[2]);

            try {
                boolean valid = validator.isValidCommuteRoute(origin, destination, distance);
                System.out.println("Valid commute from " + origin + " to " + destination + " (" + distance + " km)? " + valid);
            } catch (SameLocationException e) {
                System.out.println("SameLocationException: " + e.getMessage());
            } catch (InvalidRouteException e) {
                System.out.println("InvalidRouteException: " + e.getMessage());
            }
        }
    }
}

class SameLocationException extends InvalidRouteException{
    public SameLocationException(String message){
        super(message);
    }
}