import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class nd {
    public static void main(String[] args) throws IOException {
        String[] digits = {"", "однозначное", "Двухзначное", "Трехзначное"};
        String[] even = {"Четное", "Нечетное"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        reader.close();
        int number = Integer.parseInt(string);
        if (number >= 0 && number < 1000) {
            System.out.println(even[number % 2] + " " + digits[string.length()] + " число");
        }
    }
}
