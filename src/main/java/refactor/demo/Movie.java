package refactor.demo;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
    double getCharge(Rental rental) {
        int dayRented = rental.getDayRented();
        return getCharge(dayRented);
    }
    
    double getCharge(int dayRented) {
        double result = 0;
        switch(priceCode) {
        case Movie.REGULAR:
            result += 2; 
            if(dayRented > 2) {
                result += (dayRented - 2) * 1.5;
            }
            break;
            
        case Movie.NEW_RELEASE :
            result += dayRented * 3;
            break;
            
        case Movie.CHILDRENS :
            result += 1.5;
            if(dayRented > 3) {
                result += (dayRented - 3) * 1.5;
            }
            break;
        }
        return result;
    }
}
