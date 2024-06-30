public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0, temp = num;
        int noOfDigits = String.valueOf(num).length();

        while (num > 0) {
            int res = num % 10;
            num = num / 10;
            sum += Math.pow(res, noOfDigits);

        }

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong Number");

        } else {
            System.out.println(temp + " is not an Armstrong Number");
        }
      }
    }

