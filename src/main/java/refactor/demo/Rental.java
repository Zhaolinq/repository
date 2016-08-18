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
    
    int getFrequestRenterPoint() {
        int frequestRenterPoints = 1;
        
        if((movie.getPriceCode() == Movie.NEW_RELEASE)
                && getDayRented() > 1) {
            frequestRenterPoints ++;
        }
        return frequestRenterPoints;
    }
    
    public double getCharge() {
        return getMovie().getCharge(getDayRented());
    }
}
