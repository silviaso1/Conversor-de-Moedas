
public class Conversor {

    protected double fetchExchangeRate(String fromCurrency, String toCurrency) {

        double exchangeRate = ApiIntegration.getExchangeRate(fromCurrency, toCurrency);
        return exchangeRate;
    }
}

