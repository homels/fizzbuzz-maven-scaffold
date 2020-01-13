public class Contest {
    public static String judge(int number) {
        String result = number + "";
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                result = "fizzbuzz";
            } else {
                result = "fizz";
            }
        } else if (number % 5 == 0) {
            result = "buzz";
        }
        return result;
    }

}
