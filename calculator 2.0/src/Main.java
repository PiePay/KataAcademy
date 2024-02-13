import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        try {
            String[] parts = expression.split(" ");
            String operator = parts[1];
            String operand1 = parts[0];
            String operand2 = parts[2];

            if (operator.equals("+")) {
                System.out.println(concatenateStrings(operand1, operand2));
            } else if (operator.equals("-")) {
                System.out.println(subtractString(operand1, operand2));
            } else if (operator.equals("*")) {
                int num = Integer.parseInt(operand2);
                System.out.println(multiplyString(operand1, num));
            } else if (operator.equals("/")) {
                int num = Integer.parseInt(operand2);
                System.out.println(divideString(operand1, num));
            } else {
                throw new IllegalArgumentException("Неподдерживаемая операция");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    private static String subtractString(String str1, String str2) {
        if (str1.contains(str2)) {
            return str1.replace(str2, "");
        } else {
            return str1;
        }
    }

    private static String multiplyString(String str, int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(str);
        }
        return result.toString();
    }

    private static String divideString(String str, int num) {
        int length = str.length() / num;
        if (length > 40) {
            return str.substring(0, 40) + "...";
        } else {
            return str.substring(0, length);
        }
    }
}