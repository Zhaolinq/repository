package refactor.demo;

public class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    double getCharge(int dayRented) {
        return dayRented * 3;
    }

    int getFrequestRenterPoint(int dayRented) {
        int frequestRenterPoints = 1;
        if(dayRented > 1) {
            frequestRenterPoints ++;
        }
        return frequestRenterPoints;
    }

}
