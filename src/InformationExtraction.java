import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformationExtraction {
    public static void main(String[] args) {
        String text = "Я учусь в TMS их почта teachmeskills@gmail.com, мой номер договора: 1423-1512-51 и мой телефоном+(44)7788698.";

        String emailPattern = "\\b[\\w.]+@[\\w.-]+\\.[a-zA-Z]{2,6}\\b";
        String docNumberPattern = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String phoneNumberPattern = "\\+\\(\\d{2}\\)\\d{7}";

        printMatches(text, emailPattern, "email");
        printMatches(text, docNumberPattern, "document number");
        printMatches(text, phoneNumberPattern, "phone number");
    }

    static void printMatches(String text, String patternString, String type) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(type + ": " + matcher.group());
        }
    }
}
