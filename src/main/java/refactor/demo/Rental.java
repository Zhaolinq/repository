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
        return movie.getFrequentRenterPoints(getDayRented());
    }
    public double getCharge() {
        return movie.getCharge(getDayRented());
    }
}
