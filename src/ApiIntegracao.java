import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ApiIntegracao {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/79e937301b9c4f7a35cb9b2a/pair/";

    public static double getExchangeRate(String fromCurrency, String toCurrency) {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(API_URL + fromCurrency + "/" + toCurrency);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Erro na API: Código de resposta " + responseCode);
            } else {
                Scanner scanner = new Scanner(url.openStream());
                StringBuilder inline = new StringBuilder();
                while (scanner.hasNext()) {
                    inline.append(scanner.nextLine());
                }
                scanner.close();

                JsonObject jsonObject = JsonParser.parseString(inline.toString()).getAsJsonObject();
                return jsonObject.get("conversion_rate").getAsDouble();
            }
        } catch (Exception e) {
            System.err.println("Erro ao obter a taxa de câmbio: " + e.getMessage());
            return 0;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}
