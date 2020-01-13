public class Contest {
    public static String judge(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "fizzbuzz";
            }
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return number + "";
    }
}
