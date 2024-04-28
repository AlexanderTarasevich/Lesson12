import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-ZА-Я]{2,6}\\b");
        Matcher matcher = pattern.matcher(inputString);

        System.out.println("Аббревиатуры в строке:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
