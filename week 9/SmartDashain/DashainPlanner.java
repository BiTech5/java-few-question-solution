import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashainPlanner {
    public static void executeFestivalPlan(List<FestivalActivity> activities){
        for (FestivalActivity activity : activities) {
            activity.displayOverview();
            try {
                activity.planActivity();
            } catch (InvalidGuestCountException e) {
                System.out.println("Planning Warning (Guests): " + e.getMessage());
            } catch (BudgetExceededException e) {
                System.out.println("Planning Warning (Budget): " + e.getMessage());
            } catch (NoRouteException e) {
                System.out.println("Planning Warning (Routes): " + e.getMessage());
            } catch (FestivalPlanningException e) {
                System.out.println("General Planning Error: " + e.getMessage());
            } finally {
                System.out.println("Activity planning attempt for " + activity.activityName + " completed.");
            }
        }
    }
    public static void main(String[] args) {
        List<FestivalActivity> activities = new ArrayList<>();


        activities.add(new TikaCeremony(10, "Family Elder", 4500));

        activities.add(new TikaCeremony(2000, "Small Tika", 0));

        activities.add(new DeusiBhailo(Arrays.asList("Route 1", "Route 2", "Route 3"), 5, 5000.0));
        activities.add(new DeusiBhailo( new ArrayList<>(),
        4,
        3000.0));

        executeFestivalPlan(activities);

        System.out.println("\nNote: This system helps manage the chaos of Dashain planning, even if someone forgets the budget or the Deusi route!");
    }
}
