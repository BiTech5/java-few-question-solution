/*
17. Movie Theater Booking System

Instructions:

    Class Seat: field seatNumber, method bookSeat()
    Subclasses:
        RegularSeat: booking is allowed anytime
        PremiumSeat: booking includes snack and luxury tax
    Use method overriding and encapsulation
    File: TheaterBooking.java.

 */

class Seat {
    protected int seatNumber;
    
    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    public void bookSeat() {
        System.out.println("Seat " + seatNumber + " is booked.");
    }
}

class RegularSeat extends Seat {
    public RegularSeat(int seatNumber) {
        super(seatNumber);
    }
    
    @Override
    public void bookSeat() {
        System.out.println("Regular seat " + seatNumber + " is booked.");
    }
}

class PremiumSeat extends Seat {
    private boolean includesSnack;
    private double luxuryTax;
    
    public PremiumSeat(int seatNumber, boolean includesSnack, double luxuryTax) {
        super(seatNumber);
        this.includesSnack = includesSnack;
        this.luxuryTax = luxuryTax;
    }
    
    @Override
    public void bookSeat() {
        System.out.println("Premium seat " + seatNumber + " is booked.");
        if (includesSnack) {
            System.out.println("Includes complimentary snack.");
        }
        System.out.println("Luxury tax: Rs." + luxuryTax);
    }
}

class TheaterBooking {
    public static void main(String[] args) {
        Seat[] seats = new Seat[2];
        seats[0] = new RegularSeat(101);
        seats[1] = new PremiumSeat(201, true, 150.0);
        
        System.out.println("Theater Booking System:");
        for (Seat seat : seats) {
            seat.bookSeat();
            System.out.println();
        }
    }
}
