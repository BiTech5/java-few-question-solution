

public class TikaCeremony extends FestivalActivity {
    
    protected int expectedGuests;
    protected String mainFamilyElder;
    public TikaCeremony(int expectedGuests, String mainFamilyElder, double estimatedCost) {
        super("Tika Ceremony", estimatedCost);
        this.expectedGuests = expectedGuests;
        this.mainFamilyElder = mainFamilyElder;
    }
    @Override
    public void planActivity() throws InvalidGuestCountException, BudgetExceededException {
    if (expectedGuests < 5) {
        throw new InvalidGuestCountException("Not enough guests for a lively Tika! Is everyone on vacation?");
    } else if (estimatedCost > 50000) {
        throw new BudgetExceededException("Tika budget too high! Is this for the whole village?");
    } else {
        System.out.println("Tika ceremony with " + mainFamilyElder + " planned successfully for " + expectedGuests + " guests!");
    }
}


    public static void main(String[] args) {
        FestivalActivity[] activities = {
            new TikaCeremony(10, "Grandfather", 30000),
            new TikaCeremony(10, "Uncle", 60000),
            new TikaCeremony(2, "Aunt", 30000)
        };

        for (FestivalActivity activity : activities) {
            activity.displayOverview();
            try {
                activity.planActivity();
            } catch (FestivalPlanningException e) {
                System.out.println("Error planning activity: " + e.getMessage());
            }
            
        }
    }
}

class InvalidGuestCountException extends FestivalPlanningException {
    public InvalidGuestCountException(String message) {
        super(message);
    }
}
class BudgetExceededException extends FestivalPlanningException {
    public BudgetExceededException(String message) {
        super(message);
    }
}