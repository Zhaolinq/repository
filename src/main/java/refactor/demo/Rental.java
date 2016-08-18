package refactor.demo;

public class Rental {

    private Movie movie;
    private int dayRented;
    
    public Movie getMovie() {
        return movie;
    }
    public void setMonie(Movie movie) {
        this.movie = movie;
    }
    public int getDayRented() {
        return dayRented;
    }
    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }
    double getCharge() {
        double thisAmount = 0;
        switch(getMovie().getPriceCode()) {
        case Movie.REGULAR:
            thisAmount += 2; 
            if(getDayRented() > 2) {
                thisAmount += (getDayRented() - 2) * 1.5;
            }
            break;
            
        case Movie.NEW_RELEASE :
            thisAmount += getDayRented() * 3;
            break;
            
        case Movie.CHILDRENS :
            thisAmount += 1.5;
            if(getDayRented() > 3) {
                thisAmount += (getDayRented() - 3) * 1.5;
            }
            break;
        }
        return thisAmount;
    }
}
