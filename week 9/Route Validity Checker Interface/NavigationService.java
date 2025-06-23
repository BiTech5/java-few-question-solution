public interface NavigationService {
    void navigate(String startPoint, String endPoint, RouteValidator validator) throws NavigationFailedException;
}
class NavigationFailedException extends Exception {
    public NavigationFailedException(String message) {
        super(message);
    }

    public NavigationFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
