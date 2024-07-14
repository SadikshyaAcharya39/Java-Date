package JavaCodes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaDate {
    public static void main(String[] args) {

//        LocalDate date = LocalDate.now();
//        System.out.println("Date: " + date);

//      LocalDateTime dateTime = LocalDateTime.now();
//      System.out.println("Date and Time : " + dateTime);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before Formatting: " + dateTime);
        DateTimeFormatter objDateTime = DateTimeFormatter.ofPattern("HH:mm:ss   yyyy-MM-dd");
        String formatted = dateTime.format(objDateTime);
        System.out.println("After Formatting: " + formatted);


    }
}
