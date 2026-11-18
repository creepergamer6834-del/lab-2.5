public class Utils {
    public static String printArray(int[] array) {
        if (array == null || array.length == 0) {
            return "";
        }
        String array1 = "";
        for (int i = 0; i < array.length; i++) {
            array1 += array[i];
            if (i < array.length - 1) {
                array1 += ", ";
            }
        }
        return array1;
    }

    public static int randomNumber(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }

    public static double toDouble(String text) {
        double a = Double.parseDouble(text);
        return a;
    }

    public static String describeChar(char value) {
        if (Character.isDigit(value)) {
            return "digit";
        } else if (Character.isLetter(value)) {
            return "letter";
        } else {
            return "other";
        }
    }

    public static boolean isInteger(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        int start = 0;
        if (text.charAt(0) == '-') {
            if (text.length() == 1) {
                return false;
            }
            start = 1;
        }
        for (int i = start; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static Integer parseOrNull(String text) {
        if (isInteger(text)) {
            return Integer.parseInt(text);
        } else {
            return null;
        }
    }

    public static int locate(String text, char target) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isDecimal(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        int i = 0;
        if (text.charAt(0) == '-') {
            i++;
        }

        if (i >= text.length() || !Character.isDigit(text.charAt(i))) {
            return false;
        }

        int dotCount = 0;
        for (; i < text.length(); i++) {
            char current = text.charAt(i);
            if (Character.isDigit(current)) {
                continue;
            } else if (current == '.') {
                dotCount++;
                if (dotCount > 1) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean onlyNumAndLet(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (!Character.isLetterOrDigit(current)) {
                return false;
            }
        }
        return true;
    }

    public static int countOccurrences(String text, char target) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String text) {
        if (text == null) {
            return null;
        }
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static int arrayMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        return highest;
    }

    public static int arrayMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        return lowest;
    }

    public static double average(int[] numbers, int start) {
        if (numbers == null || numbers.length == 0 || start >= numbers.length) {
            return 0.0;
        }
        int sum = 0;
        int count = 0;
        for (int i = start; i < numbers.length; i++) {
            sum += numbers[i];
            count++;
        }
        if (count == 0) {
            return 0.0;
        }
        return (double) sum / count;
    }

    public static boolean contains(int[] numbers, int target) {
        if (numbers == null) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasImproved(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return true;
        }
        for (int i = 1; i < numbers.length; i++) {
            int previous = numbers[i - 1];
            int current = numbers[i];
            if (current < previous) {
                return false;
            }
        }
        return true;
    }

    public static int getNumber(int[] numbers, int index) {
        if (numbers == null || index < 0 || index >= numbers.length) {
            return -1;
        }
        return numbers[index];
    }

    public static double getAverageFromArray(int[] numbers, int num1, int num2) {
        if (numbers == null || num1 < 0 || num2 >= numbers.length || num1 > num2) {
            return 0.0;
        }
        int sum = 0;
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            sum += numbers[i];
            count++;
        }
        if (count == 0) {
            return 0.0;
        }
        return (double) sum / count;
    }
}