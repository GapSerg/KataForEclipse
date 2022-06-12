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

        return Integer.parseInt(part[0])+Integer.parseInt(part[1]);
    }
}
