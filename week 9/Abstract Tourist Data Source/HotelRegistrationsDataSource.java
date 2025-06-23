import java.util.*;

public class HotelRegistrationsDataSource extends TouristDataSource {

    public HotelRegistrationsDataSource() {
        super("Kathmandu Hotels Registrations");
    }

    @Override
    public List<String> fetchData() throws DataSourceAccessException ,AuthenticationFailedException{
        try {
            if (sourceName.contains("Hotels") && Math.random() < 0.2) {
                throw new AuthenticationFailedException("Hotel API authentication failed! Did someone forget the password again?");
            }

            return Arrays.asList(
                "Hotel: Yak & Yeti, Guest: Ram Thapa, NP",
                "Hotel: Annapurna, Guest: Alice Smith, AU"
            );
        } catch (DataSourceAccessException e) {
            throw new DataSourceAccessException("Failed to fetch from " + sourceName + ". Cause: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TouristDataSource hotel = new HotelRegistrationsDataSource();
        try {
            List<String> data = hotel.fetchData();
            System.out.println("Hotel data: " + data);
        } catch (DataSourceAccessException e) {
            System.out.println("Error: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
    }
}

class AuthenticationFailedException extends DataSourceAccessException {
    public AuthenticationFailedException(String message) {
        super(message);
    }
}
