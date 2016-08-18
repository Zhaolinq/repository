package refactor.demo;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    private Price price;
    
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
        switch(priceCode) {
        case NEW_RELEASE:
            price = new NewReleasePrice();
            break;
        case REGULAR:
            price = new RegularPrice();
            break;
            
        case CHILDRENS:
            price = new ChildrenPrice();
            break;
        }
    }
    
    double getCharge(int dayRented) {
        return price.getCharge(dayRented);
    }
    
    int getFrequentRenterPoints(int dayRented) {
        return price.getFrequestRenterPoint(dayRented);
    }
}
