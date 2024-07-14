package JavaCodes;

import com.sun.jdi.PathSearchingVirtualMachine;

public class JavaEnums {
   enum Days {
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
        System.out.println(days);

       //        System.out.println(days.SUNDAY);
    }
}
