import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSetExample {
    public static void main(String[] args) {

//        List<String> slowa = Array.asList();
        Set<String> strings = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        String Linia = scanner.nextLine().toLowerCase();

        String[] slowa = Linia.split(" ");         //// 1 sposob 1b
//        strings.addAll(Arrays.asList(slowa));

        for (String slowo: slowa) {                   ///  2 sposob 1b
            strings.add(slowo);
        }

        System.out.println(strings);
    }
}

