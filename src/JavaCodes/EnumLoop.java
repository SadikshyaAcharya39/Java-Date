package JavaCodes;

import java.util.logging.Level;

public class EnumLoop {

    // Loop Through Enum

    enum Days{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        Days days = Days.FRIDAY;

        for(Days day1: days.values()){
            System.out.println(day1);
        }
    }

}
