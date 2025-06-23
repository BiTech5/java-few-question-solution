import java.util.*;

public class AirportArrivalsDataSource extends TouristDataSource {

    public AirportArrivalsDataSource() {
        super("Tribhuvan Airport Arrivals");
    }

    @Override
    public List<String> fetchData() throws DataSourceAccessException, ConnectionLostException{
        try {
            if (sourceName.contains("Tribhuvan") && Math.random() < 0.3) {
                throw new ConnectionLostException("Airport data connection lost! Maybe a pigeon sat on the antenna?");
            }

            return Arrays.asList(
                "Visitor: biki, USA",
                "Visitor: raj, UK",
                "Visitor: Ram Shrestha, NP"
            );
        } catch (DataSourceAccessException e) {
            throw new DataSourceAccessException("Failed to fetch from " + sourceName);
        }
    }

    public static void main(String[] args) {
        TouristDataSource airport = new AirportArrivalsDataSource();
        try {
            List<String> data = airport.fetchData();
            System.out.println("Airport data: " + data);
        } catch (DataSourceAccessException e) {
            System.out.println("Error: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
    }
}

class ConnectionLostException extends DataSourceAccessException {
    public ConnectionLostException(String message) {
        super(message);
    }
}
