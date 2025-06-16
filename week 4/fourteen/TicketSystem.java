/*
14. Transport Ticket System

Instructions:

    Base class Ticket: fields ticketNumber, price, method generateTicket()
    Subclasses:
        BusTicket: includes seatNumber
        TrainTicket: adds coachType
        FlightTicket: adds boardingGate
    Each override generateTicket() to print formatted ticket info.
    File: TicketSystem.java.
*/
class Ticket{
    int ticketNumber;
    double price;
    public Ticket(int ticket,double price){
        ticketNumber=ticket;
        this.price=price;
    }
    void generateTicket(){
        System.out.println("Ticket N.o: "+ticketNumber);
        System.out.println("Price: "+price);
    }
}

class BusTicket extends Ticket{
    int seatNumber;
    public BusTicket(int ticket,double price,int seatNumber){
        super(ticket,price);
        this.seatNumber=seatNumber;
    }
    @Override
    void generateTicket(){
        super.generateTicket();
        System.out.println("Seat N.o: "+seatNumber);
    }
}
class TrainTicket extends Ticket{
    String coachType;
    public TrainTicket(int ticket,double price,String coachType){
        super(ticket,price);
        this.coachType=coachType;
    }
    @Override
    void generateTicket(){
        super.generateTicket();
        System.out.println("Coach Type: "+coachType);
    }
}

class FlightTicket extends Ticket{
    String boardingGate;
    public FlightTicket(int ticket,double price,String boardingGate){
        super(ticket,price);
        this.boardingGate=boardingGate;
    }
    @Override
    void generateTicket(){
        super.generateTicket();
        System.out.println("Boarding Gate: "+boardingGate);
    }
}

class TicketSystem{
    public static void main(String[] args){
    Ticket[] tickets = new Ticket[3];
    tickets[0] = new BusTicket(101, 25.50, 15);
    tickets[1] = new TrainTicket(102, 45.75, "AC");
    tickets[2] = new FlightTicket(103, 150.00, "Gate 3");

    System.out.println("Ticket System Information:");
    for (Ticket ticket : tickets) {
        ticket.generateTicket();
        System.out.println();
    }
    }
}