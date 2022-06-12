public class StringCalculator {

    public int add(String numbers) {
        int result = 0;

        if (numbers.isEmpty()) {
            return 0;
        }
        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }
        String[] part = numbers.split(",");

        for (String s:part) {
        result += Integer.parseInt(s);
        }

        return result;
    }
}
