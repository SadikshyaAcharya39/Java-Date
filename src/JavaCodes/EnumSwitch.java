package JavaCodes;

public class EnumSwitch {
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
        switch (days){

            case SUNDAY:
                System.out.println("SUNDAY");
                break;

            case MONDAY:
                System.out.println("MONDAY");
                break;

            case THURSDAY:
                System.out.println("Thursday");
                break;

            case FRIDAY:
                System.out.println("Friday");
        }
    }
}
