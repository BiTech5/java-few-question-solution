import java.util.*;

public class UniqueVisitorCounter implements DataProcessor {

    @Override
    public List<String> process(List<String> rawData) throws DataProcessingException {
        if (rawData == null || rawData.isEmpty()) {
            throw new EmptyDataException("No raw data to process! Did all tourists go missing?");
        }

        Set<String> uniqueNames = new HashSet<>();

        for (String entry : rawData) {
            String[] parts = entry.split(":");
            if (parts.length > 1) {
                String namePart = parts[1].split(",")[0].trim();
                uniqueNames.add(namePart);
            }
        }

        return Collections.singletonList("Unique Visitors: " + uniqueNames.size());
    }

    public static void main(String[] args) {
        UniqueVisitorCounter processor = new UniqueVisitorCounter();
        try {
            List<String> output = processor.process(Arrays.asList(
                "Visitor: John Doe, USA",
                "Visitor: John Doe, USA",
                "Guest: Alice Smith, AU"
            ));
            System.out.println(output);
        } catch (DataProcessingException e) {
            System.out.println("Processing error: " + e.getMessage());
        }
    }
}
class EmptyDataException extends DataProcessingException {
    public EmptyDataException(String message) {
        super(message);
    }
}
