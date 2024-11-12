
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

    public static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy  HH:mm");

        return now.format(formatter);
    }
}

