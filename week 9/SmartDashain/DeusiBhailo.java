import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeusiBhailo  extends FestivalActivity{
    
    protected  List<String> plannedRoutes;
    protected  int numberOfPerformers;
    public DeusiBhailo(List<String> plannedRoutes,int numberOfPerformers,double estimatedCost){
        super("Deusi Bhailo Program",estimatedCost);
        this.plannedRoutes=plannedRoutes;
        this.numberOfPerformers=numberOfPerformers;
    }
    @Override
    public void planActivity() throws NoRouteException, FestivalPlanningException{
        if(plannedRoutes==null || plannedRoutes.isEmpty()){
                throw new NoRouteException("No routes planned for Deusi Bhailo! Are we just singing in the living room?");
        }
        else if(numberOfPerformers<3){
            
                throw new FestivalPlanningException("Need at least 3 performers for a proper Deusi Bhailo!");
            
        }
        else{
            System.out.println("Deusi Bhailo program with " + numberOfPerformers + " performers planned for " + plannedRoutes.size() + " routes!");
        }
    }
    public static void main(String[] args){
        List<DeusiBhailo> activities = Arrays.asList(
            new DeusiBhailo(Arrays.asList("Route 1", "Route 2", "Route 3"), 5, 5000.0),
            new DeusiBhailo(Arrays.asList("Route A", "Route B"), 2, 4000.0),
            new DeusiBhailo(new ArrayList<>(), 4, 3000.0)
        );

        for (DeusiBhailo activity : activities) {
            try {
            activity.planActivity();
            } catch (FestivalPlanningException e) {
            System.out.println("Planning Error: " + e.getMessage());
            }
        }
    }
    
}
class NoRouteException  extends FestivalPlanningException{
    public NoRouteException(String message){
        super(message);
    }
}