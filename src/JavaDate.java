import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + dateTime);
        // HH:mm:ss   yyyy-MM-dd
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDateTime = dateTimeFormatter.format(dateTime);
        System.out.println("After Formatting: " + formattedDateTime);

    }
}
