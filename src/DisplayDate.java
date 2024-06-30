import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Before Formating: ");
        System.out.println(localDateTime);

        DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = localDateTime.format(formattedDateTime);
        System.out.println("After Formatting: ");
        System.out.println(formatDateTime);

    }
}
