package refactor.demo;

public class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    double getCharge(int dayRented) {
        double result = 2; 
        if(dayRented > 2) {
            result += (dayRented - 2) * 1.5;
        }
        return result;
    }

    int getFrequestRenterPoint(int dayRented) {
        return 1;
}

}
