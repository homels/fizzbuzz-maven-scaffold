public class Contest {
    public static String judge(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                returnString("fizzbuzz");
            }
            returnString("fizz");
        } else if (number % 5 == 0) {
            returnString("buzz");
        }
        return number + "";
    }

    public static String returnString(String str) {
        return str;
    }
}
