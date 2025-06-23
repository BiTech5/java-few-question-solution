
import java.util.List;

public abstract class TouristDataSource {

    public String sourceName;

    public TouristDataSource(String sourceName) {
        this.sourceName = sourceName;
    }

    public abstract List<String> fetchData() throws DataSourceAccessException;
}

class DataSourceAccessException extends Exception {
    public DataSourceAccessException(String message) {
        super(message);
    }
    public DataSourceAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
