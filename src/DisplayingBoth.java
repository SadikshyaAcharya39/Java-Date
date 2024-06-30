import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayingBoth {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Before Formatting: ");
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(" yyyy-MM-dd   HH:mm:ss:a");
        String formattedDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("After Formatting: ");
        System.out.println(formattedDateTime);
    }
}
