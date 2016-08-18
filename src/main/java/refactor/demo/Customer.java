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
        double totalAmount = 0;
        int frequestRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental record for " + getName() + "\n";
        while(rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = rentals.nextElement();
            
            switch(each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2; 
                if(each.getDayRented() > 2) {
                    thisAmount += (each.getDayRented() - 2) * 1.5;
                }
                break;
                
            case Movie.NEW_RELEASE :
                thisAmount += each.getDayRented() * 3;
                break;
                
            case Movie.CHILDRENS :
                thisAmount += 1.5;
                if(each.getDayRented() > 3) {
                    thisAmount += (each.getDayRented() - 3) * 1.5;
                }
                break;
            }
            
            frequestRenterPoints ++;
            
            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    && each.getDayRented() > 1) {
                frequestRenterPoints ++;
            }
            
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequestRenterPoints) + " frequent renter points";
        
        return result;
    }
}