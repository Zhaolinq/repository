package refactor.demo;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String name;
    private Vector<Rental> _rentals = new Vector<Rental>();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    
    public String statement() {
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental record for " + getName() + "\n";
        while(rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequestRenterPoint()) + " frequent renter points";
        
        return result;
    }
    
    private int getFrequestRenterPoint() {
        int frequestRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while(rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            frequestRenterPoints += each.getFrequestRenterPoint();
        }
        return frequestRenterPoints;
    }
    
    private int getTotalAmount() {
        int totalAmount = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while(rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }
}
