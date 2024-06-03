import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String regex = "мой IP-адрес - 164.29.145.127";
        Pattern p = Pattern.compile("\\b((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}(25[0-5]|2[0-4]\\d|1?\\d?\\d)\\b");
        Matcher m = p.matcher(regex);
        if (m.find()) {
            System.out.println(m.group());
        }
        else {
            System.out.println("Ошибка");
        }
    }
}