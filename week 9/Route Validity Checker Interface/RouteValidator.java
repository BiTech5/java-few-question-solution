public interface RouteValidator {
    boolean isValidCommuteRoute(String origin, String destination, double distanceKm) throws InvalidRouteException;
}
class InvalidRouteException extends Exception{
    public InvalidRouteException(String message){
        super(message);
    }
}